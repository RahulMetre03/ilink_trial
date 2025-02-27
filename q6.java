public class q6 {
    public static void main(String[] args) {
        System.out.println("Hello");
       System.out.println(difference(100));
       System.out.println("Here");
    }
    public static int difference(int n){
        int sum_square = (n*( n+1) )/2;
        sum_square =sum_square * sum_square;
        int square_sum = 0;
        for(int i=1;i<=n;i++){
            square_sum = square_sum + (i*i);
        }
        return sum_square-square_sum;
    }
}
