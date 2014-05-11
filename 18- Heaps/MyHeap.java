public class MyHeap {

    private int[] heap;

    public MyHeap(int[] data) {
	heap[0] = 0;
	heap = new int[data.length + 1];
	for ( int x : data ) {
	    add(x);
	}
    }

    public int findMax() {
	return heap[1];
    }

    public void removeMax() { 
	int n = 1;
	int last = heap[0];
	heap[n] = heap[last];
	heap[last] = 0;
	heap[0] = heap[0] - 1;
	while ( heap[n] >= heap[2*n] || heap[n] >= heap[2*n+1] ) {
	    if ( heap[2*n] > heap[2*n+1] ) {
		int temp = heap[n];
		heap[n] = heap[2*n];
		heap[2*n] = temp;
		n = 2*n;
	    }
	    else { 
		int temp = heap[n];
		heap[n] = heap[2*n+1];
		heap[2*n+1] = temp;
		n = 2*n+1;
	    }
	}
    }

    public void add( int x ) {
	if( heap[0] == heap.length )
	    heap = new int[heap.length + 1];
	heap[0] = heap[0] + 1;
	heap[heap[0]] = x;
	int n = heap[0];
	if ( heap[n] > heap[n/2] ) {
	    int temp = heap[n];
	    heap[n] = heap[n/2];
	    heap[n/2] = temp;
	    n = n/2;
	}
    }

}
