//brute force approach

public class Rotate {
    public static  void rotateArray(int [] nums , int k){
        int n = nums.length;

        int [] temp = new int[k];


        for (int i=0;i<k;i++){
            temp[i] =nums[i];
        }
        for (int i=k;i<n;i++){
            nums[i-k] = nums[i];

        }
        for(int i = k+1;i<n;i++){
            nums[i] = temp[i-4];
        }
    }
    public static void main(String[] args){
        int [] nums = {1,2,3,4,5,6,7};
        int k=3;
       rotateArray(nums ,k);
       for (int i=0;i<nums.length;i++){
           System.out.print(nums[i] + " ");
       }
    }
}
