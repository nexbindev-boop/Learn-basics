public class Solution15 {

    public void pattern15(int N) {
        for (int i = 0; i < N; i++) {
            char ch = 'A';

            for (int j = N; j > i; j--) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution15 s15 = new Solution15();
        s15.pattern15(5);
    }
}
