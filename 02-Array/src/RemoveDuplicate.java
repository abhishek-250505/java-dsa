public class RemoveDuplicate {

    public static int removeDupli(int [] num){


        int i=0;
        for (int j=1;j<num.length;j++){
            if (num[i] != num[j]){
                i++;
                num[i] =num[j];
            }
        }
        return i+1;
    }
    public static void main(String []args){
        int[] num = {0,0,1,1,1,2,2,3,4};
//        int [] num ={0,1,1,2};

        int k = removeDupli(num);

        System.out.println("Unique count: " + k);

        for(int i = 0; i < k; i++){
            System.out.print(num[i] + " ");
        }
    }
}
