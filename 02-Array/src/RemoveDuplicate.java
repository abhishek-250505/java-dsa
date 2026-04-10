public class RemoveDuplicate {

    public static int removeDupli(int [] num){
        int i=0;
        int j=1;
        while (j<num.length){
            if (num[i] != num[j]){
                i++;
                num[i] =num[j];
            }else {
                j++;
            }
        }
        return i+1;
    }
    public static void main(String []args){
        int[] num = {0,0,1,1,1,2,2,3,4};
//        int [] num ={0,1,1,2};

        int k = removeDupli(num);
        System.out.println("total number : " + k);

        for(int i = 0; i < k; i++){
            System.out.print(num[i] + " ");
        }
    }
}
