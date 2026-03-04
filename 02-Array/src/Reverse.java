public class Reverse {
    public static int[] reverseNum(int [] nums){
        int i =0;
        int j=nums.length-1;
        while (j>i){
            int temp=nums[j];
            nums[j] =nums[i];
            nums[i] = temp;
            i++;
            j--;

        }
        return nums;
    }
    public static void main(String[] args){
        int [] nums = {2,3,6,7,8};
        reverseNum(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
