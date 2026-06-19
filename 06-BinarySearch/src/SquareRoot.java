public class SquareRoot {


//    using binary search approach
    public static int floorSqrt(int n) {
        int ans=1;
        int start=1;
        int end=n;
        while(start<=end){
            int mid =(start+end)/2;

            if(mid *mid <=n){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       int  n=28;
        System.out.println(floorSqrt(n));
    }
}
