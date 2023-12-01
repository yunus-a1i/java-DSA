import java.util.*;

class fibonacci{
    private static ArrayList<Integer> fib(int x,ArrayList<Integer> dp){

        for(int i=2;i<=x;i++){
            dp.add(dp.get(i-1) + dp.get(i-2));
        }
        return dp;
    }
    public static void main(String[] args) {
        ArrayList<Integer> dp =new ArrayList<>(2);

        dp.add(0);
        dp.add(1);
        
        System.out.println(fib(5, dp));
    }
}