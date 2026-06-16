public class MinimumSortedArray {

    public static int findMin(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        int start =0;
        int end=nums.length-1;

        while(start<=end){
            int mid =(start+end)/2;

            if(nums[start]<=nums[end]){
                smallest=Math.min(smallest,nums[start]);
                return smallest;
            }else if(nums[start] <=nums[mid]){
                smallest= Math.min(smallest,nums[start]);
                start=mid+1;
            }else if(nums[start]>nums[mid]){
                smallest=Math.min(smallest,nums[mid]);
                end=mid-1;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int [] nums={5,1,2,3,4};
        System.out.println(findMin(nums));
    }
}

//brute force ---> using linear search , TC:-o(n)
//optimal approach ---> using binary search ,TC:-O(logn)