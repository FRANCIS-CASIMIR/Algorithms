public class Perm {

    public static void main(String[] args) {

        int a[] = {1,2,3};
        perm(a,0,2);
    }


    static void perm(int a[],int k, int n){
        if(k==n){
            for (int i =0 ;i<=n;i++){
                System.out.print(a[i]+",");
            }
            System.out.println();
        }

        else{
            for(int i = k;i<=n;i++){
                int t = a[k];
                a[k] = a[i];
                a[i] = t;

                perm(a,k+1,n);

                t = a[k];
                a[k] = a[i];
                a[i] = t;

            }
        }
    }
}
