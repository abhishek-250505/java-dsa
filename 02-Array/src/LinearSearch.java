import java.util.Scanner;

public class LinearSearch {

    public static int linearData(int [] num , int key){
        for (int i=0;i< num.length;i++){
            if (num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int [] memo = new int[num];
        for (int i=0;i<memo.length;i++){
            System.out.println("Enter number " + (i+1));
            memo[i]= sc.nextInt();

        }
        for (int i=0;i< memo.length;i++){
            System.out.print(memo[i] + " ");
        }
        System.out.println();
        System.out.println("Enter number to find index");
        int key = sc.nextInt();
        System.out.println("The number is present on index " + linearData(memo , key));
    }
}
