import java.util.*;

public class palindrome {
    private static boolean palindrome(String x){
        StringBuilder res = new StringBuilder(x);
        String temp = res.reverse().toString();
        System.out.println(temp+" "+x);
        return x == temp ? true : false;
    }
    public static void main(String[] args) {
        String x="aba";
        System.out.println(palindrome(x));
    }
}
