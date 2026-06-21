public class Solution4 {
    public void pattern4(int N) {
        for(int i=0;i<=N;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        s4.pattern4(5);
    }
}
