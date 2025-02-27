import java.math.BigInteger;

public class q25 {
    public static void main(String[] args) {
        boolean flag = true;
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(2);
        int curr = 2;
        while(flag){
            sum = a.add(b);
            a = b;
            b = sum;
            curr++;
            if(sum.toString().length() == 1000){
                flag = false;
            }
        }
        System.out.println(curr);
    }
}
