public class Solution18 {

    public void pattern18(int N) {
        for (int i = 0; i < N; i++) {
            for (char ch = (char) ('A' + N - 1 - i); ch <= (char) ('A' + N - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution18 s18 = new Solution18();
        s18.pattern18(5);
    }
}
