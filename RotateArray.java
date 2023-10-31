import java.util.*;
public class RotateArray {
        static void rotate(int[] nums, int k) {
              for(int j=1;j<=k;j++){
                int temp=nums[nums.length-1];
                for(int i=nums.length-1;i>=1;i--){
                    nums[i]=nums[i-1];
                }
                nums[0]=temp;
              }
        }
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int[] A={-1,-100,3,99};
            int k=scan.nextInt();
            rotate(A,k);
            System.out.println("Array after rotation :");
            for(int i=0;i<A.length;i++){
                System.out.println(A[i]);
            }
            scan.close();
        }
    
}
