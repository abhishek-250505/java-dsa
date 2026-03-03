public class LargestNumber {

    public static int largest(int [] num){
        int max= Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }

   public static void main(String[] args) {
        int[] num = {10,5,25,64,23,14,56};
       System.out.println("Largest element present in array is :- " +largest(num));

    }
}
