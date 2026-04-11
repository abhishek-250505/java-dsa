import java.util.Arrays;

public class MoveAllZero {
    public static void moveZero(int [] nums){
//        brute force
//        int n=nums.length;
//        int ind = 0;
//       int [] temp = new int[n];
//       for (int i=0;i<n;i++){
//           if (nums[i] !=0){
//               temp[ind] = nums[i];
//               ind++;
//           }
//       }
//       //step-2
//       for (int i = 0;i<temp.length;i++){
//           nums[i] = temp[i];
//       }
//
//       //step-3
//        for (int i =temp.length;i<n;i++){
//            nums[i] = 0;
//        }
        //optimal approach
        int n = nums.length;
        int i=0;
        int j=0;
        while(i<n){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i]=temp;
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args){
        int [] nums = {0,1,0,3,12};
//        int [] nums = {0};
         moveZero(nums);

    }
}
