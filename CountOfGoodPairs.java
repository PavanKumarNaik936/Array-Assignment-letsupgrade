public class CountOfGoodPairs {
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
        int[]A={1,2,3};
       // int B=scan.nextInt();
        System.out.println(goodPair(A));
      // scan.close();
    }
    static int goodPair(int[]A){
        int c=0;
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j])
                    c++;
            }
        }
        return c;
    }
}
