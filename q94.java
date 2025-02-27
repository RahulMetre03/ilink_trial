public class q94{
    public static void main(String[] args) {
        System.out.println();
        System.out.println(almosttriangle());
    }
    public static long almosttriangle(){
        long sum = 0;
        long a = 2, b = 2;

        while (true) {
            long c = a + b + 1;
            long d = a + b - 1;
            long perimeter1 = a + b + c;
            long perimeter2 = a + b + d;

            if (perimeter1 > 1_000_000_000 && perimeter2 > 1_000_000_000) {
                break;
            }

            double s1 = perimeter1 / 2.0;
            double s2 = perimeter2 / 2.0;

            double f1 = s1 * (s1 - a) * (s1 - b) * (s1 - c);
            double f2 = s2 * (s2 - a) * (s2 - b) * (s2 - d);
            double area1;
            double area2;

            if(f2 > 0){
                 area1 = Math.sqrt(s1 * (s1 - a) * (s1 - b) * (s1 - c));
                 if (Math.round(area1) == area1 && perimeter1 <= 1_000_000_000) {
                    sum += perimeter1;
                }
            }
            if(f1 > 0){
                 area2 = Math.sqrt(s2 * (s2 - a) * (s2 - b) * (s2 - d));
                 if (Math.round(area2) == area2 && perimeter2 <= 1_000_000_000) {
                    sum += perimeter2;
                }
            }

           
            

            a++;
            b++;
        }

        return sum;
    }
}