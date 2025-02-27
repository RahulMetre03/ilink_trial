import java.math.BigInteger;

public class q48 {
    public static void main(String[] args) {
        System.out.println(count());
    }
    public static String count() {
        BigInteger modulus = BigInteger.TEN.pow(10);
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 2_000_000; i++)
            sum = sum.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), modulus));
        return sum.mod(modulus).toString();
    }
}
