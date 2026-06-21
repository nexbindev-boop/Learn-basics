class Solution2 {

    public void pattern2(int N) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solution2 s1 = new Solution2();
        s1.pattern2(6);
    }
    
}