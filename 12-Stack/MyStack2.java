public class MyStack2 {

    private String[] stack;
    private int top;
    private int numElts;

    //constructor
    public MyStack2() {
	stack = new String[10];
	top = 0;
	numElts = 0;
    }

    //push
    public void push (String s) {
	if (top == stack.length) {
	    String[] tmp = new String[top+10];
	    for (int i = 0; i < top; i++)
		tmp[i] = stack[i];
	    stack = tmp;
	}
	    stack[top] = s;
	    top++;
	    numElts++;
    }

    //pop
    public String pop() {
	String s;
	s = stack[top];
	stack[top] = "";
	top--;
	numElts--;
	return s;
    }

    //peek
    public String peek() {
	return stack[top];
    }

    //isEmpty
    public boolean isEmpty() {
	return top == 0;
    }

    public int getSize() {
	return numElts;
    }

    //toString
    public String toString() {
	String tmp = "";
	int current = top;
	while (current-1 != 0 ) {
	    tmp += stack[current-1] + " ";
	    current = current--;
	}
	return tmp;
    }

}
