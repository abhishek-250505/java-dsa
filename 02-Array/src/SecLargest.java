import java.util.Arrays;

public class SecLargest {

   public static int getSecondLargest(int [] arr) {

       int secLargest= -1;
       int largest = arr[0];

       for (int i=1;i<arr.length;i++){
           if(arr[i] > largest){
               secLargest = largest;
               largest = arr[i];
           } else if (secLargest <arr[i] && arr[i]<largest) {
               secLargest = arr[i];
           }

       }
       if (secLargest != largest){
           return secLargest;
       }
       return -1;
    }
    public static void main(String[] args){
        int [] num = {12,35,1,10,34,1};
//        int [] num = {10,5,10};
        System.out.println(getSecondLargest(num));

   }
}
