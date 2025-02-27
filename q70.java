import java.util.Arrays;

public class q70 {
    public static void main(String[] args) {
        System.out.println(findvalue(107));
    }

    public static int findvalue(int n) {
        double res = Double.MAX_VALUE;
        int cur = -1;
        for (int i = 2; i <= n; i++) {
            int phi = eulerTotient(i);
            if (isPermutation(i, phi)) {
                double temp = (double) i / phi;
                if (temp < res) {
                    cur = i;
                    res = temp;
                }
            }
        }
        return cur;
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

    public static boolean isPermutation(int a, int b) {
        char[] aArr = String.valueOf(a).toCharArray();
        char[] bArr = String.valueOf(b).toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        return Arrays.equals(aArr, bArr);
    }
}