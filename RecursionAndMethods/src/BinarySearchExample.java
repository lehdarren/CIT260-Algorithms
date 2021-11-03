import java.util.Arrays;
import java.util.Random;

public class BinarySearchExample {
	
	private static final int SIZE = 100;
	private static final int MAX_VALUE = 500;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = new int[SIZE];
		Random rand = new Random();
		
		for(int i = 0; i < A.length; i++) {
			A[i] = rand.nextInt(MAX_VALUE);
		}
		
		Arrays.sort(A);
		
		for (int i : A) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		
		int key = 49;
		
		if(binarySearch(A, key) != -1)
			//System.out.println(binarySearch(A, key, 0, A.length - 1));
			System.out.printf("%d is found at location %d\n", key, binarySearch(A, key));
		else
			System.out.printf("%d was not found\n", key);
	}
	
	public static int binarySearch(int[] array, int key) {
		return binarySearchHelper(array, key, 0, array.length - 1);
	}
	
	
	public static int binarySearchHelper(int[] array, int key, int start, int end) {
		if(end < start)
			return -1;
		
		int mid = ((start + end) / 2);
		if(array[mid] == key)
			return mid;
		
		if(key < array[mid])
			return binarySearchHelper(array, key, start, mid - 1);
		else
			return binarySearchHelper(array, key, mid + 1, end);
	}
	
	public static void quickSort(int[] A) {
		quickSortHelper(A, 0, A.length - 1);
	}
	
	private static void quickSortHelper(int[] A, int start, int finish) {
		int i = start;
		int j = finish;
		int temp = 0;
		int pivot = A[(start + finish) / 2];
		
		while(i <= j) {
			while(A[i] < pivot)
			{
				i++;
			}
			
			while (A[j] < pivot) {
				j--;
			}
			
			if(i <= j) {
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				
				i++;
				j--;
			}
		}
		
		if(start < j)
			quickSortHelper(A, start, j);
		if (i < finish)
			quickSortHelper(A, i, finish);
	}
}
