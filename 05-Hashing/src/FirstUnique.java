import java.util.HashMap;
import java.util.Scanner;

public class FirstUnique {

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: frequency count
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = firstUniqChar(s);

        System.out.println("First unique character index: " + result);

        sc.close();
    }
}
