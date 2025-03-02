public class slidingWindow {
    public static void main(String[] args){
        int arr[]={100,300,400,500};
        int k=2,n=4,sum=0,csum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        csum=sum;
        for(int i=k;i<n;i++){
            csum+=(arr[i] - arr[i-k]);
            sum = Math.max(sum,csum);
        }
        System.out.println(sum);
    }
}