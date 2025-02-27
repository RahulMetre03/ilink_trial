import java.util.ArrayList;
import java.util.HashSet;

public class q23 {
    public static void main(String[] args) {
        //ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        for(int i=1;i<=28123;i++){
            if(getSumofDivisors(i) > i){
                //al.add(i);
                h.add(i);
            }
        }
        
        int res = 0;
        //
        boolean[] absum = new boolean[28124];
        for(int j : h){
            //System.out.println(al.get(j));
            //int p = al.get(j);
            for(int k:h){
                if(j+k<=28123){
                    absum[j+k] = true;
                }
            }
        }
        for(int i=1;i<=28123;i++){

            if(!absum[i]){
                res = res + i;
            }
        }
        System.out.println(res);







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
