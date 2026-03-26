public class Palindrome {

    public static void palindromeCheck(String name){
        int start=0;
        int end = name.length()-1;
        while (start<end){
            if (name.charAt(start) !=name.charAt(end)){
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("The string is a valid palindrome");
    }
    public static void main(String [] args){
        String name = "madam";
        palindromeCheck(name);
    }
}
