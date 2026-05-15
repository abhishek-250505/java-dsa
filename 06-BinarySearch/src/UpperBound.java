public class UpperBound {
    public static int upperBound(int [] num ,int x){
        int n =num.length;
        int low=0;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=(low + high) /2;

            if(num[mid] > x){
                ans=mid;
                high = mid-1;

            }else{
                low =mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int [] num={1,2,2,3};
        int x = 2;
        System.out.println(upperBound(num,x));

    }
}
