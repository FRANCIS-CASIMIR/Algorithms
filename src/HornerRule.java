public class HornerRule {
    public static void main(String[] args) {
        int[] coefficients = {1,9,8,2,3};// a0,a1,a2,..
        int x = 2;

        int ans = compute(x,0,coefficients,4);

        System.out.println("ans"+ans);

    }

    static int compute(int x,int k,int[] coefficients,int len){
        if(k==len) return coefficients[k];

        else
        {
            return coefficients[k]+(x*(compute(x,k+1,coefficients,len)));
        }
    }
}
