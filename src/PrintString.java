public class PrintString {
    // input a1b2c1d4
    //output abbcdddd

    public static void main(String[] args) {
        String word = "a1b2c3d4";
        parseCharAndNumber(word);
    }

    static void parseCharAndNumber(String input){

        for (int i = 0; i < input.length(); i+=2){
            //considering the fact that characters at the odd location will be the letters to be printed
            // and characters at the even location will be the number of times to be printed
            if (i%2==0){
                char charTobePrinted = input.charAt(i);
                int numberOfTimes = Character.getNumericValue(input.charAt(i+1));
                print(numberOfTimes,charTobePrinted);
                //System.out.println("char"+charTobePrinted+" To be printed "+ numberOfTimes+ "Times");
            }
        }

    }

    static void print(int numberOfTimes,char character){
        int i = 1;
        while (i<=numberOfTimes){
            System.out.print(character);
            i++;
        }
    }
}
