public class q12 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(triangle_value());
    }

    public static int check_divisors(int x) {
        int count = 0;
        int sqrtX = (int) Math.sqrt(x);

        for (int i = 1; i <= sqrtX; i++) {
            if (x % i == 0) {
                count += 2; 
                if (i * i == x) count--; 
            }
        }
        return count;
    }

    public static int triangle_value() {
        int n = 1;
        int sum = 1;

        while (check_divisors(sum) <= 500) {
            n++;
            sum += n; 
        }
        return sum;
    }
}
