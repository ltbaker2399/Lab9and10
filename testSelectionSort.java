import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
	private  SelectionSort test1;
	@Test
	public void test()
	{
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
				SelectionSort test1 = new SelectionSort();
	     	arr = test1.basicSelectionSort(arr);
	      assertArrayEquals(arr, Sortedarr);
        /** add tests to check for this unit test **/
    }
    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -7;
        Sortedarr[2] = -8;
        Sortedarr[3] = -9;
        Sortedarr[4] = -10;
				SelectionSort test1 = new SelectionSort();
	     	arr = test1.basicSelectionSort(arr);
	      assertArrayEquals(arr, Sortedarr);
        /** Test data contains negative values only **/
    }
    public void testMixed(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 0;
        arr[3] = -10;
        arr[4] = 2;
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 0;
        Sortedarr[4] = -10;
				SelectionSort test1 = new SelectionSort();
	     	arr = test1.basicSelectionSort(arr);
	      assertArrayEquals(arr, Sortedarr);
        /** Test data contains with both positive, negative and zeros **/
    }
    public void testDuplicates(){
       int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 2;
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 8;
        Sortedarr[1] = 5;
        Sortedarr[2] = 7;
        Sortedarr[3] = -10;
        Sortedarr[4] = 2;
				SelectionSort test1 = new SelectionSort();
	     	arr = test1.basicSelectionSort(arr);
	      assertArrayEquals(arr, Sortedarr);
        /** Test data contains duplicates **/
    }
}
