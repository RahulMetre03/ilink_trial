public class q3 {
    public static void main(String[] args) {
        System.out.println("Hello");
        boolean flag = if_prime(11);
        System.out.println(flag);
        long num = 600851475143L;
        System.out.println(largest_prime(num));
        System.out.println("Here");
    }

    public static boolean if_prime(long x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        
        for (long i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static long largest_prime(long x) {
        long factor = 2;
        while (x % factor == 0) {
            x /= factor;
        }

        for (long i = 3; i * i <= x; i += 2) {
            while (x % i == 0) {
                x /= i;
                factor = i;
            }
        }

        return (x > 1) ? x : factor;
    }
}
