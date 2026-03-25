public class SmallestElement {
    public static int smallest(int [] arr){
        int min  = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main (String [] args){
        int [] arr = {3,65,2,23,76,78};
        System.out.println("smallest number in array is " + smallest(arr));
    }
}
