public class q36 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(findsum());
    }

    public static long findsum() {
        long sum = 0;
        for (long i = 1; i < 1000000; i++) {
            String binary = Long.toBinaryString(i);  
            if (isPalindrome(i) && isPalindromeString(binary)) { 
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(long number) {
        return isPalindromeString(Long.toString(number));
    }

    public static boolean isPalindromeString(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
