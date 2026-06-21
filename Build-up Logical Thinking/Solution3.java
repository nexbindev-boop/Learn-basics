public class Solution3 {
    
    public void pattern3(int N) {
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        s3.pattern3(5);
    }
}
