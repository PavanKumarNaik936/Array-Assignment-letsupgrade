import java.util.*;
public class CheckElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=1;i<=T;i++){
            int n=scan.nextInt();
            int[] Arr=new int[n];
            for(int j=0;j<n;j++){
                Arr[j]=scan.nextInt();
            }
            int B=scan.nextInt();
            boolean isPresent=false;
            for(int k=0;k<n;k++){
                if(Arr[k]==B) isPresent=true;
            }
            if(isPresent) System.out.println(1);
            else System.out.println(0);
        }
        scan.close();
    }
}
