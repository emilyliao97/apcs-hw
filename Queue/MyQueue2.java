public class MyQueue2 {

    private Array[] queue;
    private int head;
    private int tail;
    private int maxLength;
    private int len;

    public MyQueue2() {
	queue = new Array[10];
	head = 0;
	tail = -1;
	maxLength = 10;
	len = 0;
    }

    public void enqueue(String s) {
	tail++;
	queue[tail] = s;
    }

    public String dequeue() {
	String tmp = queue[head];
    }

}