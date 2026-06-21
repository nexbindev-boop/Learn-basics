public class Solution6 {

    public void pattern6(int N) {
        for(int i=1;i<N;i++) {
            for(int j=N;j>i;j--) {
                System.out.print((N - j +1) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
        s6.pattern6(6);
    }
}
