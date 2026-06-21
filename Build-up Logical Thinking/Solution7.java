public class Solution7 {

    public void pattern7(int N) {
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution7 s7 = new Solution7();
        s7.pattern7(5);
    }
}
