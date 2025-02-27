public class q2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        long y = fibonacci(400000);
        //fibonacci(10);
        System.out.println(y);
        System.out.println("Here");
      }
      public static long fibonacci(int x){
        long a = 1;
        long b = 2;
        long sum = 2;
        long final_res = 0;
        while(sum<=4000000){
          sum = a + b;
          a = b;
          b = sum;
          if(sum % 2 == 0){
            final_res = final_res + sum;
          }
          //System.out.println("Numbers are: " + a + " "+ b);
        }
        return final_res+2;
      }
}
