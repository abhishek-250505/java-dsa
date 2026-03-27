import java.util.ArrayList;
public class MaximumNumber {
    static void main(String[] args) {
        ArrayList <Integer> element = new ArrayList<>();
        element.add(1);
        element.add(3);
        element.add(54);
        element.add(8);
        int max=Integer.MIN_VALUE;
        for (int i=0;i<element.size();i++){
            if (element.get(i)>max){
                max=element.get(i);

            }
        }
        System.out.println(max);
    }
}
