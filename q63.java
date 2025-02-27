import java.math.BigInteger;

public class q63 {
    public static void main(String[] args) {
        System.out.println(countPowerDigitMatches());
    }

    public static int countPowerDigitMatches() {
        int count = 0;

        for (int i = 1; i < 10; i++) { 
            int j = 1;
            while (true) {
                BigInteger res = BigInteger.valueOf(i).pow(j);
                int digitCount = res.toString().length();

                if (digitCount == j) {
                    count++;
                } else if (digitCount < j) {
                    break;
                }
                j++;
            }
        }
        return count;
    }
}
