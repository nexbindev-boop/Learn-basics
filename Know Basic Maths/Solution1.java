class Solution1 {

    public void CountNumber(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

    static int CountNumberOptimal(int n) {
        int cnt = (int) (Math.log10(n) + 1);
        return cnt;
    }

    public static void main(String[] args) {
        // Solution1 s1 = new Solution1();
        int count = CountNumberOptimal(12345);
        System.out.println(count);

        // s1.CountNumber(123456);
    }
}