public class MergerArrays {

    public static void main(String[] args) {
        int[] a = {1,2,3,4},b = {2,3,4,5};

        int[] merged = merge(a,b);
        for (int i = 0; i < merged.length; i++){
            System.out.print(merged[i]+",");
        }
    }

    static int[] merge(int[] a, int[] b){

        int lena = a.length,lenb = b.length;
        int pointerToA = 0,pointerToB=0,resArrIndex=0;
        int[] resArray = new int[lena+lenb];

        while( (pointerToA <= lena-1) || (pointerToB <= lenb-1) ){

            if(pointerToA == lena){
                resArray[resArrIndex] = b[pointerToB];
                pointerToB++;
            }
            else if(pointerToB == lenb){
                resArray[resArrIndex] = a[pointerToA];
                pointerToA++;
            }
            else {
                if (a[pointerToA] <= b[pointerToB]) {

                    resArray[resArrIndex] = a[pointerToA];
                    if ((a[pointerToA] == b[pointerToB])) pointerToB++;
                    pointerToA++;

                } else {

                    resArray[resArrIndex] = b[pointerToB];
                    if (a[pointerToA] == b[pointerToB]) pointerToA++;
                    pointerToB++;

                }
            }
            resArrIndex++;
        }

        return resArray;
    }
}
