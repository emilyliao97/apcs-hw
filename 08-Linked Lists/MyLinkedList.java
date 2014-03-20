public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
	head = null;
	//don't really have to say this --> sets it as default
    }

    public void add(String s) {
	Node temp = new Node(s);
	temp.setNext(head);
	head = temp;
    }

    public String toString() {
	String s = "";
	for (int j = 0; j < length(); j++) {
	    s += getNode(j).getData() + "/n";
	}
	return s;
    }

    //helper function-- returns the Node at a given location i
    //assume that there is at least one value in the linked list
    public Node getNode(int i) {
	Node k = head;
	if ( i != 0 ) {
	    for (int j = 0; j < i; j++ )
		k = k.getNext();
	}
	return k;
    }

    //add at location i (0 at front)
    //error if you try to add past the end
    public void add(int i, String s) {
	Node k = getNode(i);
	Node l = getNode(i-1);
	Node g = new Node(s);
	if ( i == 0 ) {
	    g.setNext(head);
	}
	else { 
	    g.setNext(k.getNext());
	    l.setNext(g);
	}
    } 

    //returns String at location i
    public String get(int i) {
        return getNode(i).getData();
    }

    //sets location i to s 
    //returns old value
    public String set(int i, String s) {
	String temp = getNode(i).getData();
	getNode(i).setData(s);
	return temp;
    }

    //removes item at location i
    //returns old value
    public String remove(int i) {
	String temp = getNode(i).getData();
	getNode(i-1).setNext(getNode(i+1));
	return temp;
    }

    //returns location of item with value s
    //returns -1 if not found
    public int find(String s) {
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
	return ctr;
    }

}
