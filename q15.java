import java.math.BigInteger;

public class q15 {
    public static void main(String[] args) {
        System.out.println(computePaths(20));
    }

    public static BigInteger computePaths(int n) {
        return factorial(2 * n).divide(factorial(n).multiply(factorial(n)));
    }

    public static BigInteger factorial(int num) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
