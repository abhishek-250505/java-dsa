import java.lang.reflect.Array;
import java.util.Arrays;

public class KokoBanana {

    public static int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        int ans=0;
        int start=1;
        int end=max;
        while(start<=end){
            int mid = start + (end - start)/2;
            long time=bananaPiles(piles,mid);
            if(time<=h){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    //
    public static   long bananaPiles(int [] piles,int speed){
        long sum=0;
        for (int i=0;i<piles.length;i++){
            sum += (piles[i] + speed - 1) / speed;;

        }

        return sum;
    }
    public static void main(String[] args) {
        int []piles = {3,6,7,11};
//           int [] piles={30,11,23,4,20};
        int h=8;
        System.out.println(minEatingSpeed(piles,h));
    }
}
