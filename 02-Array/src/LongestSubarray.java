public class LongestSubarray {

    public static int subString(int[]nums , int target){
        int max=0;
        for (int i=0;i<nums.length;i++){

            for (int j=0;j< nums.length;j++){

                int sum = 0; int count=0;

                for (int k=i;k<=j;k++){
                    sum +=nums[k];
//                    System.out.print(nums[k]+ " ");
                    count++;
                }

                if (sum == target){
                    max = Math.max(max,count);

                }
//                System.out.println();

            }

        }
        return max;
    }
   public static void main(String[] args) {
//        int [] nums ={10,5,2,7,1,9};
       int [] nums ={ -3, 2, 1};
       int target =6;

       System.out.println(subString(nums , target));
    }
}
