import java.util.*;

public class FirstRepeating {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5};

        HashMap<Integer, Integer> map = new HashMap<>();

        //  frequency count
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //  first repeating element
        for(int num : arr){
            if(map.get(num) > 1){
                System.out.println("First repeating element: " + num);
                return;
            }
        }

        System.out.println("No repeating element found");
    }
}
