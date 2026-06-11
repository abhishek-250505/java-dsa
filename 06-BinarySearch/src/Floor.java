public class Floor {

    public static int findFloor(int [] nums ,int x){
        int start=0;
        int end=nums.length-1;
        int ans=0;
        while(start<=end){
            int mid=(start +end)/2;
            if(nums[mid]<=x){
                ans= Math.max(ans,nums[mid]);
                start=mid+1;
            }else{
                end =mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {3,4,4,7,8,10};
        int x=11;
        System.out.println(findFloor(nums ,x));
    }
}
