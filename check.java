public class check {
    public static void main(String[] args) {
        int arr = {2,1,2,1,3,2,1};
        int n1 = 0,n2 = 0,c1 =0,c2 =0;
        for(int i=1;i<n;i++){
            if(n1 == null && n2 == null) {
            n1 = arr[i-1];
            n2 = arr[i];
            }
            else if(n1 != arr[i] || n2 != arr[i]) {
                c1--;
                c2--;
            }
            else if(n1 == arr[i]) c1++;
            else  c2++;
        }
        if(c1 >= 2) System.out.println(c1);
        if(c2 >= 2) System.out.println(c2);
    }
}
