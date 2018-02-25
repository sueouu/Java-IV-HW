/*
 * Shu Ou -- Java IV Assignment I
 * 
 * The BinarySearch Class contains the binarySearch method with the overflow issue; 
 * as well as the newBinarySearch method, which is an attempt to fix such issue
 */

package binaryTest;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int o[] = {1,2,3};
		
		binarySearch(o, 1);
		
		newBinarySearch(o, 1);
	}

	public static int binarySearch(int[] a, int key) 
	{ 
		int low = 0; 
		int high = a.length - 1; 
		
		while (low <= high) 
		{ 
			int mid = (low + high) / 2; 
			int midVal = a[mid]; 
		
			if (midVal < key)
				low = mid + 1; 

			else if (midVal > key) 
				high = mid - 1; 
			else 
				return mid; // key found 
		}
		
		return -(low + 1);  // key not found. 

	} 
	
	
	public static int newBinarySearch(int[] a, int key) 
	{ 
		int low = 0; 
		int high = a.length - 1; 
		
		while (low <= high) 
		{
			int mid = low + (high - low) / 2; 
			int midVal = a[mid]; 
		
			if (midVal < key)
				low = mid + 1; 

			else if (midVal > key) 
				high = mid - 1; 
			
			else 
				return mid; // key found 
		}
		
		return -(low + 1);  // key not found. 

	} 

}
