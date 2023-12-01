import java.util.*;

public class twoSum {
    public static ArrayList<Integer> twoSum(int a[],int t){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(t-a[i])){
                 res.add(map.get(t-a[i]));
                 res.add(i);
                 return res;
            }
            else
            map.put(a[i],i);
        }


        res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        int a[]={2,7,11,15};
        int t=9;
        System.out.println(twoSum(a,t));
    }
}
