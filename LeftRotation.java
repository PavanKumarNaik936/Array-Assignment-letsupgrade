public class LeftRotation {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};
       /* int t=A[A.length-1];
        for(int i=A.length-1;i>=1;i--){
            A[i]=A[i-1];
        }
        A[0]=t;*/
        for(int k=1;k<=3;k++){
        
        	int t=A[0];
        	for(int i=0;i<A.length-1;i++){
        		A[i]=A[i+1];
        	}
        	A[A.length-1]=t;
        		for(int i=0;i<A.length;i++){
           		System.out.print(A[i]+" ");
        	}
            System.out.println();
        }
    }
}
