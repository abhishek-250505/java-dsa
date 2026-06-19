public class SingleElement {
    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];

    }

    public static int singleElem(int [] nums ){
        int n=nums.length;
        if(n == 1)
           return nums[0];

        if(nums[0] != nums[1])
            return nums[0];

        if(nums[n-1] != nums[n-2])
            return nums[n-1];
        for(int i=1;i<nums.length-1;i++){

            if(nums[i] !=nums[i-1] && nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int [] nums= {1,1,2,3,3,4,4,8,8};
//          int []nums = {1,2,2,3,3};
           int [] nums={1};
        System.out.println(singleNonDuplicate(nums));
        System.out.println(singleElem(nums));

    }
}
