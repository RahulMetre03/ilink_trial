import java.math.BigInteger;

public class q16 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(findsumofdigits(2, 1000));
        
    }
    public static int findsumofdigits(int a, int b){
        int sum = 0;
        BigInteger num = BigInteger.valueOf(a).pow(b);
        String str = num.toString();

        for(char c: str.toCharArray()){
            sum = sum + Character.getNumericValue(c);
        }

        return sum;
    }
}
