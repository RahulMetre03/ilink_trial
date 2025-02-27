public class q53 {
    public static void main(String[] args) {
        System.out.println(calSum(100, 1000000));
    }

    public static int calSum(int n, int k) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            long ncr = 1;  // nC0 = 1
            for (int r = 1; r <= i; r++) {
                ncr = (ncr * (i - r + 1)) / r; //ncr = nc(r-1) * (n-r+1) / r 
                if (ncr > k) {
                    count += (i - 2 * r + 1); // if ncr > 1m, all remaining values > 1m => count = cout + (total values checked - remaning)
                    break;
                }
            }
        }
        return count;
    }
}
