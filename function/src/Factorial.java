import java.util.Scanner;

public class Factorial {

    public static int factorialData(int num) {
        int result = 1;
        for (int i =1;i<=num;i++){
           result *=i;
        }
        return result;
    }

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int num = sc.nextInt();

        System.out.println(factorialData(num));
    }
}
