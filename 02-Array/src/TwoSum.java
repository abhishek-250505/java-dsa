import java.util.Arrays;

public class TwoSum {


    public static int[] twosum(int [] num ,int target){
        for (int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                if (num[i] + num[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args){
        int [] num = {2,7,11,15};
        int target = 9;
        System.out.print(Arrays.toString(twosum(num, target)));
    }
}
