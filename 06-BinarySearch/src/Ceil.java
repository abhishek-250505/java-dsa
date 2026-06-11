public class Ceil {
    public static int findCeil(int [] nums , int x){
        int start=0;
        int end=nums.length-1;
        int ans=0;
        while(start<=end){
            int mid =(start +end)/2;
            if(nums[mid]>=x){
                ans= nums[mid];
                end= mid-1;
            }
            else{
                start=mid+1;
            }
        }
       return ans;
    }
    public static void main(String[] args) {
        int [] nums = {3,4,4,7,8,10};
        int x=9;
        System.out.println(findCeil(nums , x));

    }
}
