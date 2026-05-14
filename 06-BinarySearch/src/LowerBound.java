public class LowerBound {
    public static int lowerBound(int[] nums, int x) {
        int n = nums.length;
        int start=0;
        int end=n-1;
        int ans = n;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] >=x){
                ans = mid;
                end = mid - 1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int [] nums= {3,5,8,15,19};
        int x=9;
        System.out.println(lowerBound(nums,x));
    }
}