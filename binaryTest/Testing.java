/*
 * Shu Ou -- Java IV Assignment I
 * 
 * This Class contains two JUnit tests to first expose the error of the original 
 * binarySearch method, and to second evaluate the feasibility of the revised 
 * binarySearch method (newBinarySearch).
 * 
 * Both tests are expected to PASS, with the first JUnit Test printing exception
 * msg on console. For details, please see readme.txt
 * 
 * 
 */


package binaryTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing {
	
	private static int a = Integer.MAX_VALUE/2+2 ;
	private static int [] arr = new int [a];
	
	private static int key = Integer.MAX_VALUE/2+1; 
	private static int expected = Integer.MAX_VALUE/2+1;
	
	
	@BeforeClass
	
	public static void setup() {
			
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = i;
		}
	}
	
	
	@AfterClass
	
	public static void teardown() {
		
		arr = new int [0]; // empty array
	}
	
	
	@Test
	public void testOld() {
			
		try {
			int output = BinarySearch.binarySearch(arr, key);
		
			assertEquals(expected,output);
		}
		catch (Exception e) {
			System.out.println("The binarySearch method is problematic. Exception Trace below" );
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNew() {
			
		int output = BinarySearch.newBinarySearch(arr, key);
		
		assertEquals(expected,output);
	}

}
