import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        HashMap<String,Integer>map = new HashMap<>();
        map.put("Abhishek anand",14);
        map.put("Abhishek ",16);
        map.put("Adarsh",25);
        System.out.println(map.get("Abhishek"));

    }
}