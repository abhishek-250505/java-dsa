import java.util.*;

public class SubArray {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 1};
        int []arr ={1,3,5};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important

        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
    }
}