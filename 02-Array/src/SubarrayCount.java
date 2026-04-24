public class SubarrayCount {

    public static int countSum(int [] arr,int k){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                int sum=0;
                count=0;
                for(int l=i;l<=j;l++){
                    sum = sum+ arr[l];

                    if(sum==k){
                        count++;
                    }
                }
            }
        }
        return count;
    }
   public static void main(String[] args) {
       int [] arr={1,2,1,2,1};
       int k=3;
       System.out.println(countSum(arr,k));

    }
}
