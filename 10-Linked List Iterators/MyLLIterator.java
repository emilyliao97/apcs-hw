public class MyLLIterator<E> implements Iterator<E> {

    private Node<E> currentNode;
    private Node<E> pastNode;

    public MyLLIterator<E>(Node<E> p, Node<E> c) {
	pastNode = p;
	currentNode = c;
    }

    public boolean hasNext() {
	if (currentNode.getNext() == null) 
	    return false;
	else 
	    return true;
    }

    public E next() {
	E temp = currentNode.getData();
	pastNode = currentNode;
	currentNode = currentNode.getNext();
	return temp;
    }

    public void remove() {
	pastNode.setNext(currentNode.getNext());
    }

}
