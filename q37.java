public class q37 {
    public static void main(String[] args) {
        TruncatablePrimes();
    }

    public static void TruncatablePrimes(){
        int sum = 0;
        for (int i = 100; i <= 1_000_000; i++) {
            if (isTruncatablePrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isTruncatablePrime(int num) {
        if (!isPrime(num)) return false;
        return isLeftTruncatable(num) && isRightTruncatable(num);
    }

    public static boolean isLeftTruncatable(int num) {
        int divisor = 1;
        while (divisor <= num) {
            divisor *= 10;
        }
        divisor /= 10;

        while (num > 0) {
            if (!isPrime(num)) return false;
            num %= divisor;
            divisor /= 10;
        }
        return true;
    }

    public static boolean isRightTruncatable(int num) {
        while (num > 0) {
            if (!isPrime(num)) return false;
            num /= 10;
        }
        return true;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
