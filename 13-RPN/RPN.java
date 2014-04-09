import java.util.Scanner; 

public class RPN {

    private double[] stack;
    private int top;
    private int numElts;

    //constructor
    public RPN() {
	stack = new double[10];
	top = -1;
	numElts = 0;
    }

    //push
    public void push (double s) {
	if (top == stack.length) {
	    double[] tmp = new double[top+10];
	    for (int i = 0; i < top; i++)
		tmp[i] = stack[i];
	    stack = tmp;
	}
	top++;
	stack[top] = s;
	numElts++;
    }

    //pop
    public double pop() {
	double s;
	s = stack[top];
	stack[top] = 0;
	top--;
	numElts--;
	return s;
    }

    //peek
    public double peek() {
	return stack[top];
    }

    //isEmpty
    public boolean isEmpty() {
	return top == -1;
    }

    public int getSize() {
	return numElts;
    }

    //toString
    public String toString() {
	String tmp = "";
	int current = top;
	while (current >= 0 ) {
	    tmp += stack[current] + " ";
	    current--;
	}
	return tmp;
    }

    public void hpcal(String one) { 
	double t1;
	double t2;
	double ans;
	if (one.equals("+")) {
	    t1 = pop();
	    t2 = pop();
	    ans = t1 + t2;
	    push(ans);
	    System.out.println(ans);
	}
	else if (one.equals("-")) {
	    t1 = pop();
	    t2 = pop();
	    ans = t1 - t2;
	    push(ans);
	    System.out.println(ans);
	}
	else if (one.equals("*")) {
	    t1 = pop();
	    t2 = pop();
	    ans = t1 * t2;
	    push(ans);
	    System.out.println(ans);
	}
	else if (one.equals("/")) {
	    t1 = pop();
	    t2 = pop();
	    ans = t1 / t2;
	    push(ans);
	    System.out.println(ans);
	}
	else {
	    push(Double.parseDouble(one));
	}
    }

    public static void main (String[] args) {
	RPN hp = new RPN();
	boolean go = true;
	System.out.println("Welcome to your calculator.");
	System.out.println("To exit, please type 'Stop'.");
	while (go == true) {
	    Scanner a = new Scanner(System.in);
	    String input = a.next();
	    if ( input.equals("Stop") )
		 go = false;
	    else
		hp.hpcal(input);
	}
    }

}
