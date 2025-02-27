public class q34 {
    public static void main(String[] args) {
        System.out.println(getDigitSum());
    }
    public static int getDigitSum(){
        int sum = 0;

        for(int i=10;i<500000;i++){
            String s = Integer.toString(i);
            int p = 0;
            for(int j=0;j<s.length();j++){
                p = p + calculate_factorial(Character.getNumericValue(s.charAt(j)));
            }
            if(p == i){
                sum = sum + i;
            }
        }

        return sum;
    }

    public static int calculate_factorial(int n){
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<10;i++){
            arr[i] = arr[i-1] * i;
        }
        return arr[n];
    }
}
