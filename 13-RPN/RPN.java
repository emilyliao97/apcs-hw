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

    public void hpcal() { 
	Scanner one = new Scanner(System.in);
	if (one.next().equals('+')) {
	    double t1 = pop();
	    double t2 = pop();
	    double ans = t1 + t2;
	    push(ans);
	}
	else if (one.next().equals('-')) {
	    double t1 = pop();
	    double t2 = pop();
	    double ans = t1 - t2;
	    push(ans);
	}
	else if (one.next().equals('*')) {
	    double t1 = pop();
	    double t2 = pop();
	    double ans = t1 * t2;
	    push(ans);
	}
	else if (one.next().equals('/')) {
	    double t1 = pop();
	    double t2 = pop();
	    double ans = t1 / t2;
	    push(ans);
	}
	else {
	    push(one.nextDouble());
	}
    }

}
