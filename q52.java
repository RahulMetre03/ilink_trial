

public class q52 {
    public static void main(String[] args) {
        System.out.println(giveresult());
    }
    public static boolean aretheysame(int a, int b){
        
        if(Integer.toString(a).length() != Integer.toString(b).length()) return false;

        
        return a == b;
    }
    public static int giveresult(){

        
        int res = 0;

        for(int i=1;i<1000000;i++){
            int x = sortDigits(i);
            int count = 1;
            for(int j=2;j<7;j++){
                int y = sortDigits(i*j);
                if(aretheysame(x, y)){
                    count++;
                }
            }
            if(count == 6)
                res = i;
            }
            return res;
        }
        
        

    

    public static int sortDigits(int n) {
        int[] digits = new int[10];
        while (n != 0) {
            digits[n % 10]++;
            n /= 10;
        }
    
        int sorted = 0;
        for (int digit = 1; digit < digits.length; digit++) {
            for (int count = digits[digit]; count > 0; count--) {
                sorted = sorted * 10 + digit;
            }
        }
        return sorted;
    }


}

