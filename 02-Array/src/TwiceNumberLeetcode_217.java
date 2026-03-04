import java.util.Arrays;

public class TwiceNumberLeetcode_217 {

    public static boolean repeatedNum(int nums[]){
        // sort the array
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int [] nums = {1,2,1,4};
        System.out.println(repeatedNum(nums));
    }
}
