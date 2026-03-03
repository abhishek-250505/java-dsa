public class SumArray {

        public static int sumOfArray(int [] num){
            int result =1;
            for (int i=0;i<num.length;i++){
                result +=num[i];
            }
           return result;
        }

        public static void main(String[] args){
            int []num = {3,5,7,32,34,32,22};
            System.out.println("The sum of Array is :- "+ sumOfArray(num));
        }

}
