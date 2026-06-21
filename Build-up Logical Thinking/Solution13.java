public class Solution13 {

    public void pattern13(int N) {
        int num = 1;
        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution13 s13 = new Solution13();
        s13.pattern13(5);
    }
}
