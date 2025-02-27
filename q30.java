public class q30 {
    public static void main(String[] args) {
        System.out.println(findNum());
    }

    public static int findNum(){
        int i = 0;
        int sum = 0;
        for(i=10;i<1_000_000;i++){
            if(i == sumOfFifthPowers(i)){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int sumOfFifthPowers(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            
                sum += Math.pow(digit, 5);
        
                n /= 10;
            
        }
        return sum;
    }
}
