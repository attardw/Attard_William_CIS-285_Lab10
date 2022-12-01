package Lab10;

public class SelectionSort {
	 private int temp;
	/** Creates a new instance of SelectionSort */
	    public SelectionSort() {
	    }

	    /* A simple SelectionSort algorithm
	     * pre-condition:
	     * post-condition:
	     * inputs:
	     * outputs:
	     * special conditions:
	     */
	    public int[] basicSelectionSort(int[] x) {
	        for (int i = 0; i < x.length; ++i) {
						int min = i;
	            for (int j= i+1; j < x.length; ++j) {
	                if (x[j] < x[i]) {
	                    min = j;
                      temp = x[min];
                      x[min]=x[i];
                      x[i]=temp;
                      //edit made in mixdup branch because I had fixed the issue
	                }
	            } // end of inner for loop
	        } // end of outer for loop
	        return x;
	    } // end of basicSelectionSort method
	}
