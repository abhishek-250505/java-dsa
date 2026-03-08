import java.lang.reflect.Array;
import java.util.Arrays;

public class SquaresSortedArray {

    public static void sort(int[] nums){
        for (int i=0;i<nums.length;i++){
            nums[i] = (int) Math.pow(nums[i],2 );

        }
        Arrays.sort(nums);

    }
    public static void main(String[] args){
        int [] nums ={-4,-1,0,3,10};
        sort(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
