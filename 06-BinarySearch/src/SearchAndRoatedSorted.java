public class SearchAndRoatedSorted {

//    using linear search , tc:o(n)
    public static int searchRoated(int [] nums ,int target){
        for (int i=0;i<nums.length;i++){
            if(nums[i] ==target){
                return i;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while(start <= end){

            int mid = (start + end )/2;

            if(nums[mid] == target)
                return mid;

            if(nums[start] <= nums[mid]){

                // left sorted

                if(target>= nums[start] && target<nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }else{

                // right sorted

                if(target>= nums[start] && target<nums[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] nums ={4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchRoated(nums ,target));
        System.out.println(search(nums , target));
    }
}
