public class firstandLat {
    public static int firstOccurance(int [] nums ,int target){
      int start=0;
      int end= nums.length-1;
      int first =-1;

      while(start<=end){
          int mid = (start +end)/2;
          if (nums[mid] == target ){
              first=mid;
              end= mid-1;
          }
          else if (nums[mid]<target){
              start=mid+1;
          }else{
              end=mid-1;
          }
      }
      return first;
    }

//    for last occurance

    public static int lastOccurance(int [] nums ,int target) {
        int start = 0;
        int end = nums.length - 1;
        int last = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                last = mid;
                start= mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return last;
    }
    public static int[] firstAndLast(int [] nums ,int target){
        int first = firstOccurance(nums, target);
        int last = lastOccurance(nums ,target);

        if (first == -1){
            return new int[]{-1,-1};
        }else {
            return new int[]{first , last};
        }
    }
    public static void main(String[] args) {
        int [] nums={2,8,8,8,8,8,11,13};
        int target= 8;
        int [] value =firstAndLast(nums ,target);
        for (int i=0;i<value.length;i++){
            System.out.print(value[i] + " ");
        }


    }
}
