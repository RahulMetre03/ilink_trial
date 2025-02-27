public class q14 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(findNum(1000000));
    }

    public static int findNum(int max) {
        int curr = 1;
        int max_series_num = 1;
        int max_count = 0;

        while (curr != max) {
            int count = 1;
            long res = curr; 

            do {
                if (res % 2 == 0) {
                    res = res / 2;
                } else {
                    res = (3 * res) + 1;
                }
                count++;
            } while (res != 1);

            if (count > max_count) {
                max_count = count;
                max_series_num = curr; // Store the number with the longest sequence
            }
            curr++;
        }
        return max_series_num;
    }
}
