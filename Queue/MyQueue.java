public class MyQueue {

    private Node head;
    private Node tail;
    private int len;

    public MyQueue() {
	head = null;
	tail = null;
	len = 0;
    }

    public void enqueue(String s) {
	Node n = new Node(s);
	if (len == 0) { //or head == null
	    head = n;
	    tail = n;
	}
	else {
	    tail.setNext(n);
	    tail = n;
	}
	len++;
    }

    public String dequeue() {
	String s;
	if (head == null) {
	    return null;
	}
	s = head.getData();
	head = head.getNext();
	len--;
	if (head == null) {
	    tail = null;
	}
	return s;
    }

    public String front() {
	return head.getData();
    }

    public int length() {
	return len;
    }

    public String toString() {
	String s = "Head --> ";
	if (head == null) 
	    s = s + "null --> ";
	else {
	    Node tmp = head;
	    while (tmp != null) {
		s = s + tmp.getData() + " --> ";
		tmp = tmp.getNext();
	    }
	    s = s.substring(0, s.length() - 4);
	}
	s = s + " <-- tail";
	return s;
    }

}