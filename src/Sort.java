
/*
 * 
 * Problem Description
 * =====================
 
Given an array arr[] of N distinct numbers, the task is to sort all even-placed numbers in increasing and odd-place numbers in decreasing order. The modified array should contain all sorted even-placed numbers followed by reverse sorted odd-placed numbers.
Note that the first element is considered as even because of its index 0.

Example 1:

Input: N = 8
arr[] = {0, 1, 2, 3, 4, 5, 6, 7}
Output: 0 2 4 6 7 5 3 1
Explanation: 
Even-place elements : 0, 2, 4, 6
Odd-place elements : 1, 3, 5, 7
Even-place elements in increasing order : 
0, 2, 4, 6
Odd-Place elements in decreasing order : 
7, 5, 3, 1
Example 2:

Input: N = 9
arr[] = {3, 1, 2, 4, 5, 9, 13, 14, 12}
Output: 2 3 5 12 13 14 9 4 1
Explanation: 
Even-place elements : 3, 2, 5, 13, 12
Odd-place elements : 1, 4, 9, 14
Even-place elements in increasing order : 
2, 3, 5, 12, 13
Odd-Place elements in decreasing order : 
14, 9, 4, 1
 
 */


public class Sort {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Before Sort");
		print(a);
		
		sortZigZag(a);
		
		System.out.println("After Sort");
		print(a);
		
	}

	
	static void sortZigZag(int[] a) {
		
		int len = a.length;
		
		for(int i = 0; i <= len-2; i++) {
			
			if((i % 2) != 0) {
				// index 0,2,4,.. odd posititions
				// should be sorted in non-decreasing order(a0<=a2<=a4..)
				int min = i;
				
				for(int j = i + 2; j < len;j+=2) {
					
					if(a[j] < a[min]) {
						min = j;
					}
					
				}
				
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
				
			}
			else {
				// index 1,3,5,.. even posititions
				// should be sorted in non-increasing order(a0>=a2>=a4..)
				int max = i;
				
				for(int j = i + 2; j < len;j+=2) {
					
					if(a[j] > a[max]) {
						max = j;
					}
					
				}
				
				int temp = a[i];
				a[i] = a[max];
				a[max] = temp;
			}
			
			
		}
		
	}
	
	static void selectionSort(int[] a) {
		
		int len = a.length;
		
		for(int i = 0; i < len; i++) {
			
			int min = i;
			
			for(int j = i + 1; j < len;j++) {
				
				if(a[j] < a[min]) {
					min = j;
				}
				
			}
			
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
	}
	
	static void print(int[] a) {
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		
		System.out.println();
	}
	
}
