public class q5 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(findsum());
    }


    public static boolean isDiv(int x){
        for(int i=1;i<21;i++){
            if(x%i == 0) continue;
            else return false;
        }
        return true;
    }
    public static int findsum(){
        boolean flag = true;
        int i = 2520;
        while(flag){
            if(isDiv(i)){
                flag = false;
            }
            else{i++;}
        } 
        
        return i;
    }
}
