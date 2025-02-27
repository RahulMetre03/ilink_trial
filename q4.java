import java.util.*;


public class q4 {
    public static void main(String[] args) {
       System.out.println("Hello");
       prod();
       System.out.println("Here"); 
    }
    public static void prod(){
        //boolean flag = true;
       int max_prod = 1;
       int prod = 1;
        outerloop:
        for(int i = 999;i>99;i--){
            for(int j = 999;j>99;j--){
                prod = i*j;
                if(palindrome(prod)){
                    if(prod > max_prod){
                        max_prod = prod;
                    }
                   //System.out.println(i*j);
                   //break outerloop;
                }
            }
        }
        System.out.println(max_prod);
    }
    
    public static boolean palindrome(int x){
        String str = Integer.toString(x);
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
