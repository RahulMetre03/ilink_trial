import java.util.ArrayList;

public class q92 {
    public static void main(String[] args) {
        System.out.println(findsum());
    }

    public static long findsum() {
        long sum = 0;

        for (int i = 2; i < 1000000; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            int temp = i;

            while (true) {
                temp = sumOfSquares(temp);
                if (temp == 89) {
                    sum += i;
                    break;
                }
                if (temp == 1 || al.contains(temp)) break;
                al.add(temp);
            }
        }
        return sum;
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
