public class BloomFlower {

    public static boolean minimumDay(int[] bloomDay ,int day,int m,int k){
        int count=0;
        int bouquet=0;
        for(int i=0;i<bloomDay.length;i++){
            if(day>=bloomDay[i]){
                count++;
            }
            if(count>=k){
                bouquet += (int)Math.floor(count/k);
                count=0;
            }
        }

        if (bouquet>=m){
            return true;
        }
        return false;
    }


    public static int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(m*k)){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<bloomDay.length;i++) {
            if (max < bloomDay[i]) {
                max = bloomDay[i];
            }
            if (min > bloomDay[i]) {
                min = bloomDay[i];
            }
        }

        int low=min;
        int high=max;
        while (low<=high){
            int mid=low+(high-low)/2;

        }
        // for print
        for(int i=min;i<=max;i++){
            if(minimumDay(bloomDay, i, m, k) ==true) return i;
        }
        return -1;
    }
     static void main(String[] args) {
        int [] bloomDay={1,10,3,10,2};
        int m=3;
        int k=1;

         System.out.println(minDays(bloomDay,m,k));
    }
}
