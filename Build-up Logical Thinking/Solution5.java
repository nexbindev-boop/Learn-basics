public class Solution5 {
    public void pattern5(int N) {
        for(int i=0;i<N;i++) {
            for(int j=N;j>i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        s5.pattern5(5);
    }
}
