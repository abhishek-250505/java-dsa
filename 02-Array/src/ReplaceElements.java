import java.util.Arrays;

public class ReplaceElements {
    public static int[] replace(int [] arr){
        int n = arr.length;
        int max = -1;

        for(int i = n-1; i >= 0; i--){

            int current = arr[i];
            arr[i] = max;

            if(current > max){
                max = current;
            }
        }

        return arr;

    }
    public static void main(String[] args){
        int [] arr= {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replace(arr)));
    }
}
