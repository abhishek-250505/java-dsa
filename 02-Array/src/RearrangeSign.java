import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeSign {

    public static int[] signElement(int []num){
       ArrayList<Integer>list = new ArrayList<>();
       ArrayList<Integer>negative = new ArrayList<>();

       for (int i=0;i< num.length;i++){
           if(num[i] >= 0){
               list.add(num[i]);
           }else{
               negative.add(num[i]);
           }

       }
        int k=0;
        int l=0;
       for (int j=0;j< num.length;j++){

           if(j % 2==0){
               num[j] = list.get(k);
               k++;
           }else{

               num[j] = negative.get(l);
               l++;
           }
       }

       return num;
    }
    public static void main(String[] args){
//        int [] num= {3,1,-2,-5,2,-4};
        int [] num ={-1,1};
        System.out.println(Arrays.toString(signElement(num)));

    }
}
