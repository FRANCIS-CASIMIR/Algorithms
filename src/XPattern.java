public class XPattern {

    public static void main(String[] args) {
        String word = "francis";
        //System.out.print(word.length());

        printPattern(word);
    }

    static void printPattern(String word){
        // assuming that given string is of odd length
        /*
        * This will print the given string in the following pattern
        *
          f     s
           r   i
            a c
             n
            a c
           r   i
          f     s

        * */

        if(word.length()==1){
            System.out.print(word);
            return;
        }
        else {

            int initPos = 0,finPos = word.length()-1;
            int row = 0;
            boolean reachedHalfway = false;

            while (row< word.length()){

                for (int i = 0; i < word.length();i++){
                    if (i==initPos || i==finPos) System.out.print(word.charAt(i));
                    else System.out.print(" ");

                    if (initPos==finPos) reachedHalfway = true;
                }

                if(reachedHalfway) {
                    finPos++;initPos--;

                }else {
                    finPos--;initPos++;
                }
                System.out.println();
                row++;
            }

        }
    }

}
