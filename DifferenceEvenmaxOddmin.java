public class DifferenceEvenmaxOddmin {
    public static void main(String[] args) {
        int[] A={0,2,4,6,8,10,12,14,16,18,20};
        int N=A.length;
        int EvenMax=A[0];
        int OddMin=A[0];
        for(int i=0;i<N;i++){
            if(A[i]%2==0){
                EvenMax=A[i];
                break;
            }
        }
        for(int i=0;i<N;i++){
            if(A[i]%2!=0){
                OddMin=A[i];
                break;
            }

        }
        for(int i=0;i<N;i++){
            if(A[i]%2==0){
                if(A[i]>EvenMax)
                    EvenMax=A[i];
            }else{
                if(A[i]<OddMin)
                    OddMin=A[i];
            }
        }
        if(EvenMax%2==0 && OddMin %2!=0)
            System.out.println(EvenMax-OddMin);
        else{
            if(EvenMax%2==0 && OddMin%2==0)
                System.out.println(EvenMax);
            else System.out.println(0-OddMin);
        }
    }
}
