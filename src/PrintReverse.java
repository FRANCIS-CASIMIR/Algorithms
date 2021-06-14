/*
* Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
*
* */

public class PrintReverse {

    public static void main(String[] args) {
        String word = "Hi";
        revStr(word);
    }

    static void revStr(String word){
        int startPos = 0,endPos = word.length();

        for (int i = word.length()-1; i >= 0; i--){

            if(word.charAt(i)==' '){
                startPos = i + 1;
                System.out.print(word.substring(startPos,endPos)+" ");
                endPos = i ;
            }
            if(i==0){
                startPos = 0;
                System.out.println(word.substring(startPos,endPos)+" ");
            }
        }

    }


}
