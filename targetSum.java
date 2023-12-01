import java.util.*;

public class targetSum {
    private static ArrayList<Integer> targetSum(int a[],int t){
        int s=0,sum=0,e=0;
        int n=a.length;
        ArrayList<Integer> res=new ArrayList<Integer>();

        while(s < n){
            sum +=a[s];
            
            while(e < s && sum > t){
                sum -=a[e];
                e++;
            }
                if(sum == t){
                    res.add(e+1);
                    res.add(s+1);
                    return res;
                }
                s++;
            
        }
        res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,7,5};
        int s=12;

        System.out.print(targetSum(a,s));
    }
}
