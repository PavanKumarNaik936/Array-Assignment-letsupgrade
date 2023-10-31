public class ReverseString {
    public static void main(String[] args) {
        char[] A={'h','e','l','l','o'};
        System.out.println(A);
        for(int i=0,j=A.length-1;i<A.length/2;i++,j--){
            char temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
        System.out.println(A);
    }
}
