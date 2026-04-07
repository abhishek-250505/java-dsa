import java.util.Arrays;

//Example 1:
//
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
public class TwoSumSorted {

    public static int[] twoSum(int [] numbers ,int target){
       int start = 0;
       int end = numbers.length-1;
        int [] res = new int[2];

       while (start<end){
           int sum = numbers[start] +numbers[end];

           if (sum == target){

               res[0]=start+1;
               res[1]= end+1;
               return res;

           } else if (sum>target) {
               end--;
           }else {
               start++;
           }
       }
       return null;
    }
    public static void main (String[] args){
        int [] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));

    }
}
