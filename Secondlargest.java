public class Secondlargest {
    public static void main(String[] args) {
        int[] Arr={2};
        int max1=Arr[0];
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]>max1){
                max2=max1;
                max1=Arr[i];
            }
            else if((Arr[i]>max2)&&(Arr[i]!=max1)){
                max2=Arr[i];
            }
        }
        
        if(max2!=Integer.MIN_VALUE) System.out.println(max2);
        else System.out.println(-1);
    }
}
