import java.util.*;
public class OddEvenArray{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        for(int i=1;i<=k;i++){
            int n=scan.nextInt();
            int[]A=new int[n];
            
            for(int j=0;j<n;j++){
                A[j]=scan.nextInt();
            }
            int o=0;int e=0;
            for(int j=0;j<n;j++){
                if(A[j]%2==0)
                    e++;
            else
                    o++;
            }
            int[]AOdd=new int[o];
            int[]AEven=new int[e];
            for(int j=0,a=0,b=0;j<n;j++){
                if(A[j]%2==0)
                    AEven[a++]=A[j];
                else
                    AOdd[b++]=A[j];
            }
            for(int p=0;p<AOdd.length;p++){
                System.out.print(AOdd[p]+" ");
            }
            System.out.println();
            for(int q=0;q<AEven.length;q++){
                System.out.print(AEven[q]+" ");
            }
        }
       scan.close(); 

    }
}