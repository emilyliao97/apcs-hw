public class DoubleLL<E> {

    private class Node<E> {
	E data;
	Node<E> next, prev;
	public Node(E d) {
	    this.data = d;
	}
	public String toString() {
	    return "" + data;
	}

	public void setData(E d) { data = d; }
	public E getData() { return data; }

	public void setNext(Node<E> n) { next = n; }
	public Node<E> getNext() { return next; }

	public void setPrev(Node<E> p) { prev = p; }
	public Node<E> getPrev() { return prev; }
    }

    private Node<E> current;

    public void insert(E d) {
	Node<E> n = new Node<E>(d);
	if (current == null) {
	    current = n;
	    n.next = n;
	    n.prev = n;
	}
	else {
	    n.next = current;
	    n.prev = current.prev;
	    n.prev.next = n;
	    current.prev = n;
	    current = n;
	}
    }

    public void delete() {
	if (current.next.equals(current)) {
	    current = null;
	}
	else {
	    current.prev.next = current.next;
	    current.next.prev = current.prev;
	    current = current.next;
	}
    }

    public int find(E s) {
	Node<E> tmp = current;
	int ctr = 0;
	do {
	    if(tmp.getData().equals(s)) 
		return ctr;
	    tmp = tmp.next;
	    ctr++;
	}
	while (tmp != current);
	return -1;
    }

    public E getCurrent() {
	return current.getData();
    }

    public void forward() {
	if (current.getNext() != null) 
	    current = current.getNext();
    }

    public void back() {
	if (current.getPrev() != null) 
	    current = current.getPrev();
    }

    public String toString() {
	Node<E> tmp = current;
	String s = "";
	if (tmp == null) 
	    return "";
	do {
	    s = s + tmp.getData() + "";
	    tmp = tmp.getNext();
	}
	while (tmp != current);
	return s;
    }

    public static void main (String[] args) {
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	//First test up to here
	System.out.println(L.getCurrent());
	L.forward();
	L.forward();
	L.forward();
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	L.delete();
	System.out.println(L);
	System.out.println(L.find("hello"));
	
    }

}