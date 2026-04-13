import java.util.Arrays;

public class SingleNumber {

    public static int singleNums(int []nums){
        for (int i=0;i<nums.length;i++){
            int arr = nums[i];
            int count=0;
            for (int j=0;j<nums.length;j++){
                if (nums[j] == arr){
                    count++;
                }
            }
            if (count==1){
                return arr;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] nums ={2,2,1};
        System.out.println(singleNums(nums));
    }
}
