public class Node<E> {

    private E data;
    private Node<E> next;

    public Node<E>(E s) {
	data = s;
    }
    public void setData(E s) {
	data = s;
    }
    public E getData() {
	return data;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node<E> getNext() {
	return next;
    }

    public String toString() {
	return "Data: " + data /*+ "Next: " + next */;
    }
}

