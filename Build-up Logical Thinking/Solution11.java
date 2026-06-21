public class Solution11 {

    public void pattern11(int N) {
        for (int i = 0; i < N; i++) {
            int start = (i % 2 == 0) ? 1 : 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");

                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution11 s11 = new Solution11();
        s11.pattern11(7);
    }
}
