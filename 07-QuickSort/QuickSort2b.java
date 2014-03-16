public class QuickSort2b {

    public int partition( int[] a, int L, int R ) {
	int wall = 0; 
	int p = (int) ( Math.random() * R );
	//System.out.println("Partition at: " + p);
	int temp1 = a[R];
	a[R] = a[p]; 
	a[p] = temp1;
	for ( int i = 0; i < R; i++ ) {
	    if ( a[i] < a[R] ) {
		int temp2 = a[wall];
		a[wall] = a[i];
		a[i] = temp2;
		wall++;
	    }
	}
	int pivot = a[R];
	a[R] = a[wall];
	a[wall] = pivot;
	//System.out.println(printArray(a));
	int wall2 = wall;
	for ( int x = 0; x < R; x++ ) {
	    if ( a[R] == pivot) {
		a[wall2] = a[x];
		a[x] = pivot;
		wall2++;
	    }
	}
	return (wall + wall2) / 2;
    }

    public void qSort( int[] A, int lo, int hi ) {
	if (A.length-1 <= 1) {
	    return;
	}
	else {
	    int k = partition(A, lo, hi);
	    if ( k-1 > 1 ) 
		qSort(A, 1, k-1);
	    if ( k+1 < hi ) 
		qSort(A, k+1, hi);
	}
    }

    public void qSort(int[] A) {
	qSort(A, 0, A.length-1);
    }

    public String printArray(int[] z) {
	String retStr = "[  ";
	for ( int i = 0; i < z.length; i++ )
	    retStr += z[i] + "  ";
	retStr += "]";
	return retStr;
    }

    public static void main (String[] args) {
	QuickSort2 qs = new QuickSort2();
	int[] newb = new int[11];
	for (int i = 0; i < newb.length; i++) {
	    newb[i] = (int) ( Math.random() * 20 );
	}
        qs.qSort(newb);
    }

}
