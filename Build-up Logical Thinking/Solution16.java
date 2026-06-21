public class Solution16 {
    public void pattern16(int N) {
        for (int i = 0; i < N; i++) {
            char ch = (char) ('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution16 s16 = new Solution16();
        s16.pattern16(5);
    }
}
