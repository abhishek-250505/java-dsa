import java.util.ArrayList;


public class RevreseArray {
    public static void main(String[] args) {
        ArrayList <Integer> element = new ArrayList<>();
         element.add(1);
         element.add(2);
        element.add(3);
        element.add(4);

        for (int i=element.size()-1;i>=0;i--){
            System.out.print(element.get(i) +" ");
        }


    }
}
