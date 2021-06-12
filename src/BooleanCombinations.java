public class BooleanCombinations {

    public static void main(String[] args) {
        boolean a[] = {true,true,true};
        vone(-1,a,2);
    }

   static void vone(int pos,boolean[] a,int len){
        if(pos==len){
            for (int i = 0; i <= len; i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        else {

            // 0th position starts from here
            vone(pos+1, a, len);
            a[pos+1] = !a[pos+1];
            vone(pos+1, a, len);

        }
    }

    void newPossibleComb(int pos,boolean[] a,int len){
        if(pos==len){
            for (int i = 0; i <= len; i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        else {
            for (int i = pos; i <= len; i++) {
                newPossibleComb(i+1, a, len);
                a[i] = !a[i];
                newPossibleComb(i+1, a, len);
            }
        }

    }

    void possibleCombinations(int pos,boolean[] a,int len){
        if(pos==len-1){
            for (int i = 0; i < len; i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        else
        {
                possibleCombinations(++pos,a,len);
                a[pos] = !a[pos];
                possibleCombinations(pos,a,len);

        }
    }

}
