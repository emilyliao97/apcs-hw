public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node() {
	data = 0;
	left = null;
	right = null;
    }

    public Node(int x) {
	data = x;
	left = null;
	right = null;
    }

    public int getData() {
	return data;
    }

    public Node getLeft() {
	return left;
    }

    public Node getRight() {
	return right;
    }

    public void setData(int s) {
	data = s;
    }

    public void setLeft(Node l) {
	left = l;
    }

    public void setRight(Node r) {
	right = r;
    }

}
