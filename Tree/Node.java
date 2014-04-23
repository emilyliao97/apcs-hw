public class Node {

    private String data;
    private Node left;
    private Node right;

    public Node() {
	data = null;
	left = null;
	right = null;
    }

    public String getData() {
	return data;
    }

    public Node getLeft() {
	return left;
    }

    public Node getRight() {
	return right;
    }

    public String setData(String s) {
	String temp = data;
	data = s;
	return temp;
    }

    public Node setLeft(Node l) {
	Node temp = left;
	left = l;
	return temp;
    }

    public Node setRight(Node r) {
	Node temp = right;
	right = r;
	return temp;
    }

}