public class DivisorThreshold {
    public static boolean smallest(int[] nums, int threshold ,double divide){
        int sum=0;

        for (int i=0;i< nums.length;i++){
            sum+=(int)Math.ceil(nums[i]/divide);
//            System.out.println("sum " +sum);
        }

        if(sum<=threshold){
            return true;
        }
      return false;
    }
    public static int smallestDivisor(int[] nums, int threshold) {

        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int start=1;
        int end=max;
        while(start<=end){
            int mid=(start+end)/2;

           if (smallest(nums,threshold,mid)){
               ans=mid;
               end=mid-1;
           }else {
               start=mid+1;
           }
        }

      return ans;
    }
    public static void main(String[] args) {
        int []nums = {44,22,33,11,1};
        int threshold=5;
        System.out.println(smallestDivisor(nums,threshold));

    }
}
