public class q69 {
    public static void main(String[] args) {
        System.out.println(findNumber()); 
    }

    public static int findNumber() {
        double curr_max = 0;
        int res = 0;
        for (int i = 2; i < 1_000_000; i++) {
            int p = eulerTotient(i);
            double ratio = (double) i / p;
            if (ratio > curr_max) {
                res = i;
                curr_max = ratio;
            }
        }
        return res;
    }


    public static int eulerTotient(int n) {
        int result = n;
        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                while (n % p == 0) {
                    n /= p;
                }
                result -= result / p;
            }
        }
        if (n > 1) {
            result -= result / n;
        }
        return result;
    }
}