import java.util.*;
public class GoodPair {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[]A={1,2,2};
        int B=scan.nextInt();
        System.out.println(goodPair(A,B));
       scan.close();
    }
    static int goodPair(int[]A,int B){
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]+A[j]==B)
                    return 1;
            }
        }
        return 0;
    }

}
