Shu Ou -- Java IV Assignment I (JUnit on Binary Search)

INTRODUCTION 
--------------

The purpose of this assignment is to develop two valid JUnit tests to expose the overflow error (ArrayIndexOutofBoundsException exception) of the original binary search method and to test the revised binary search method. 

Getting Started
---------------

JUnit4 is required for running the Unit tests developed.  Employing IDE such as Eclipse and NetBeans are recommended. 


CONTENTS
--------------

This zip file contains the following:

	readme.txt -- this file
	Shu Ou HW I SourceCode and Class Files -> binaryTest
		Testing.java -- contains two JUnit tests to test 1) the original binarySearch method and to expose its overflowing issue by printing the exception message on console. 2) the revised binarySearch method (called newBinearySearch) to examine solution applied is successful in resolving the overflowing issue
		BinarySearch.java -- contains both the revised binary search method with solution to resolve the overflowing issue and the orginal binarySearch method with the overflowing issue
	BinarySearchTest.jar


HOW THE JUNIT TESTS WORK
--------------

It's important to note that BOTH JUnit Tests in the Testing Class are expected to PASS, although the first JUnit Test is used to test the problematic binarySearch method.  Below is how it works:

A try/catch idiom is created when developing the first JUnit Test for testing the original binarySearch method, as such method is expected to be erroneous. The test will pass if an exception occurs.  And the exception message of such JUnit test will be printed on the console for easy investigation.  
The second JUnit Test is developed to evaluate the revised binarySearch method (newBinarySearch) and to see whether the existing issue has been corrected or not.  The test will pass if such error has been corrected. 

	
	

