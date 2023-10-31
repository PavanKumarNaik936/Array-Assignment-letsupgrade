public class RemoveMaxMin{
    static int minimum(int x,int y){
        if(x<y)
            return x;
        else return y;
    }
    static int maximum(int x,int y){
        if(x>y)
            return x;
        else return y;
    }
    public static void main(String[] args) {
     int[] A={2,10,7,5,4,1,8,6};
     int N=A.length;
     int min=0;
     int max=0;
     
     for(int i=0;i<A.length;i++){
        if(A[i]<A[min])
            min=i;
        if(A[i]>A[max])
            max=i;
     } 
     if(min+1<=N/2 && max+1<=N/2){
        System.out.println(maximum(min+1,max+1));
     }
     else if(min+1>N/2 && max+1>N/2){
        System.out.println(maximum(N-min,N-max));
     }
     else{
        int X=minimum(min+1,A.length-min);
        int Y=minimum(max+1,A.length-max);
        System.out.println(X+Y);
     }
     System.out.println(A[min]+" "+A[max]);

    }
}