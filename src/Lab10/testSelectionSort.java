package Lab10;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
	private SelectionSort temp1;
@Test

public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort temp1 = new SelectionSort();
        int temp[] = temp1.basicSelectionSort(arr);
        
        for(int i = 0;i<5;i++) {
        	
        	/** add tests to check for this unit test **/
        	if(i==0) {
            assertEquals(2,temp[i]);
        	}
        	if(i==1) {
                assertEquals(7,temp[i]);
        	}
        	if(i==2) {
                assertEquals(8,temp[i]);
        	}
        	if(i==3) {
                assertEquals(9,temp[i]);
        	}
        	if(i==4) {
                assertEquals(10,temp[i]);
        	}
        }
        
        
    }
    
    public void testNegative(){
        
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
    	
        
        SelectionSort temp1 = new SelectionSort();
        int temp[] = temp1.basicSelectionSort(arr);
        
        for(int i = 0;i<5;i++) {
        	
        	/** Test data contains negative values only **/
        	if(i==0) {
            assertEquals(-10,temp[i]);
        	}
        	if(i==1) {
                assertEquals(-9,temp[i]);
        	}
        	if(i==2) {
                assertEquals(-8,temp[i]);
        	}
        	if(i==3) {
                assertEquals(-7,temp[i]);
        	}
        	if(i==4) {
                assertEquals(-2,temp[i]);
        	}
        }
        
    }
    
    public void testMixed(){
        
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = 0;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -8;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 10;
    	
        SelectionSort temp1 = new SelectionSort();
        int temp[] = temp1.basicSelectionSort(arr);
        
        for(int i = 0;i<5;i++) {
        	
        	/** Test data contains with both positive, negative and zeros **/
        	if(i==0) {
            assertEquals(-9,temp[i]);
        	}
        	if(i==1) {
                assertEquals(-8,temp[i]);
        	}
        	if(i==2) {
                assertEquals(0,temp[i]);
        	}
        	if(i==3) {
                assertEquals(2,temp[i]);
        	}
        	if(i==4) {
                assertEquals(10,temp[i]);
        	}
        }
        
        
    }
    
    public void testDuplicates(){
        
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = -2;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -2;
        Sortedarr[2] = 7;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;
    	
        SelectionSort temp1 = new SelectionSort();
        int temp[] = temp1.basicSelectionSort(arr);
        
        for(int i = 0;i<5;i++) {
        	
        	/** Test data contains duplicates **/
        	if(i==0) {
            assertEquals(-2,temp[i]);
        	}
        	if(i==1) {
                assertEquals(-2,temp[i]);
        	}
        	if(i==2) {
                assertEquals(7,temp[i]);
        	}
        	if(i==3) {
                assertEquals(8,temp[i]);
        	}
        	if(i==4) {
                assertEquals(8,temp[i]);
        	}
        }
        
        
    }
}