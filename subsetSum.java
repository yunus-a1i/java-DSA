import java.util.*;

public class subsetSum {

    public static void fun(int[] arr, ArrayList<Integer> res,int pos,int sum){
        if(pos == arr.length){
            res.add(sum);
        }
        else{
            fun(arr, res, pos+1, sum + arr[pos]);
            fun(arr, res, pos+1, sum);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,2,1};
        ArrayList<Integer> res=new ArrayList<>();
        fun(arr,res,0,0);
        System.out.print(res);
    }
}
