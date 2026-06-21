public class Solution10 {

    public void pattern10(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution10 s10 = new Solution10();
        s10.pattern10(5);
    }
}
