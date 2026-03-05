public class BinarySearch {
    public static  int searchNum(int [] num , int target){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid = (start +end)/2;
            if (num[mid] == target){
                return mid;
            } else if (num[mid]<target) {
                start= mid+1;
            }else if(num[mid]>target){
               end= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] num = {2,4,12,15,23,34,45,65};
        int target = 12;
        System.out.println("The number is found at index " + searchNum(num,target));

    }
}
