public class Consecutive {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max=0;
        int start=0;
        while(start<nums.length){
            if(nums[start] ==1){
                count++;
                start++;
                max= Math.max(max,count);
            }else{
                count=0;
                start++;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
