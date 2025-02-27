public class q1 {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      int sum = sumofMultiples(1000);
      System.out.println(sum);
      int y = fibonacci(10);
      System.out.println(y);
      System.out.println("Here");
    }
    public static int sumofMultiples(int x){
      int sum = 0;
      for(int i=0;i<x;i++){
        if(i%3 == 0 || i%5 == 0){
          sum = sum + i;
        }
      }
      return sum;
    }
    public static int fibonacci(int x){
      int a = 1;
      int b = 2;
      int sum = 0;
      for(int i=1;i<=x;i++){
        sum = a + b;
        a = b;
        b = sum;
      }
      return sum;
    }
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
  }