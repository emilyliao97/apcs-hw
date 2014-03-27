public class MyLinkedList<E> implements Iterable<E> {

    private Node<E> dummy;
    private Node<E> head;
    private Node<E> tail;
    private int length;

    public Iterator<E> iterator() {
	//make and return a new iterator over this linked list
	Iterator<E> it = new MyLLIterator<E>(dummy, head);
	return it;
    }

    public MyLinkedList() {
	dummy.setNext(head);
	head = new Node<E>("0");
	tail = head;
	//don't really have to say this --> sets it as default
    }

    public void add(E s) {
	Node<E> temp = new Node<E>(s);
	temp.setNext(head);
	dummy.setNext(temp);
	length++;
    }

    public String toString() {
	String s = "";
	for (int j = 1; j < length(); j++) {
	    s += getNode(j).getData() + "/n";
	}
	return s;
    }

    //helper function-- returns the Node at a given location i
    //assume that there is at least one value in the linked list
    public Node<E> getNode(int i) {
	Node<E> k = head;
	if ( i != 0 ) {
	    for (int j = 0; j < i; j++ )
		k = k.getNext();
	}
	return k;
    }

    //add at location i (0 at front)
    //error if you try to add past the end
    public void add(int i, E s) {
	Node<E> lag = dummy;
	Node<E> lead = head;
	Node<E> insert = new Node<E>(s);
	if (i == length-1) 
	    addEnd(s);
	for ( int j = 0; j < i; j++ ) {
	    lag = lead;
	    lead = lead.getNext();
	}
	insert.setNext(lead.getNext());
	lag.setNext(insert);
	length++;
    } 

    public void addEnd(E s) {
	Node<E> temp = new Node<E>(s);  
	tail.setNext(temp);
	tail = temp;
	length++;
    }


    //returns String at location i
    public E get(int i) {
        return getNode(i).getData();
    }

    //sets location i to s 
    //returns old value
    public E set(int i, E s) {
	E temp = getNode(i).getData();
	getNode(i).setData(s);
	return temp;
    }

    //removes item at location i
    //returns old value
    public E remove(int i) {
        Node<E> lag = dummy;
	Node<E> lead = head;
	for ( int j = 0; j < i; j++ ) {
	    lag = lead;
	    lead = lead.getNext();
	}
	E temp = lead.getData();
	lag.setNext(lead.getNext());
	length--;
	return temp;
    }

    //returns location of item with value s
    //returns -1 if not found
    public int find(E s) {
	int ctr = -1;
	for (int j = 0; j<length(); j++) {
	    if ( getNode(j).getData().equals(s) ) {
		ctr = j;
	    }
	}
	return ctr;
    }

    //return number of elements in list
    public int length() {
	int ctr = 1;
	while (getNode(ctr).getNext() != null) 
	    ctr++;
	length = ctr;
	return ctr;
    }

}
