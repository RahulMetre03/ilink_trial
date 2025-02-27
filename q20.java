import java.math.BigInteger;

public class q20 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(findsumoffactorial(100));
    }
    public static int findsumoffactorial(int n){
        BigInteger factorial = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        int sum = 0;
        String str = factorial.toString();

        for(char c: str.toCharArray()){
            sum = sum + Character.getNumericValue(c);
        }
        return sum;
        }

}
