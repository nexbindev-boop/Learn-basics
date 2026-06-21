public class Solution14 {
    public void pattern14(int N) {

        for(int i=0;i<N;i++) {
            char ch = 'A';
            for(int j=0;j<=i;j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solution14 s14 = new Solution14();
        s14.pattern14(5);
    }
}
