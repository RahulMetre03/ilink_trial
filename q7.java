public class q7 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int y = find_prime(10001);
        System.out.println(y);
        System.out.println("Here");

    }
    public static int find_prime(int x){
        int count = 1;
        int i = 3;
        while(count != x){
            if(if_prime(i)){
                count++;
            }
            i++;
        }
        return ++i;
        
    }
    public static boolean if_prime(long x){
        for(long i=2;i<x/2;i++){
        if(x % i == 0){
            return false;
            }
        }
        return true;
    }

}
