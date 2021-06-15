/*
 * 
 * Given two strings A and B, find if A is a subsequence of B.

Example 1:

Input:
A = AXY 
B = YADXCP
Output: 0 
Explanation: A is not a subsequence of B
as 'Y' appears before 'A'.
 

Example 2:

Input:
A = gksrek
B = geeksforgeeks
Output: 1
Explanation: A is a subsequence of B.


Expected Time Complexity: O(N) where N is length of string B.
Expected Auxiliary Space: O(1)

 * */
public class SubSequence {
	
	public static void main(String[] args) {
		String A = "Casimir";
		String B = "Francis";
		
		System.out.println(subSeq(A,B));
	}
	
	static int subSeq(String A,String B) {
		
		int blen = B.length();
		int alen = A.length();
		int pointerA ,pointerB;
		
		for(pointerA = 0,pointerB = 0; (pointerA < alen) && (pointerB < blen); pointerB++) {
			
			char Achar = A.charAt(pointerA);
			char Bchar = B.charAt(pointerB);
			
			if(Achar == Bchar) {
				pointerA++;
			}
			
		}
		
		if(alen == pointerA) return 1;
		else  return 0;
	}
	
}
