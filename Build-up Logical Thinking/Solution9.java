class Solution9 {

    public void pattern9(int N) {
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

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution9 s9 = new Solution9();
        s9.pattern9(5);
    }
}