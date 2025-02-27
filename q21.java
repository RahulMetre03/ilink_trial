import java.util.ArrayList;
import java.util.HashMap;

public class q21 {
    public static void main(String[] args) {
       System.out.println(getSumofDivisors(220));
       System.out.println(getSumofDivisors(284));
       System.out.println(getSumofAmicableNumbers(10000));
        
    }

    public static int getSumofAmicableNumbers(int n){
        int sum = 0;

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0;i<=n;i++){
            int p = getSumofDivisors(i);
            if(p!=i && getSumofDivisors(p) == i){
                if(!hash.containsKey(i) && !hash.containsKey(p)){
                    sum  = sum + i + p;
                    hash.put(i,p);
                    hash.put(p,i);
                }
            }
        }

        return sum;
    }

    public static int getSumofDivisors(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
    
    
    
    
}
