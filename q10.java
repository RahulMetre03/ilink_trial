public class q10 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(find_sum(2000000));
    }

    public static long find_sum(long x){
        long sum = 0;
        for(int i=2;i<x;i++){
            if(if_prime(i)){
                sum = sum + i;
                System.out.println(i);
            }
        }
        return sum;
    }

    public static boolean if_prime(int x){
        for(long i=2;i<x;i++){
        if(x % i == 0){
            return false;
            }
        }
        return true;
    }

}
