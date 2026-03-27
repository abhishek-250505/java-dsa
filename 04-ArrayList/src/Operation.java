import java.util.ArrayList;

public class Operation{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

//        operation perform
        System.out.println("Add element in ArrayList:- ");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Element in ArrayList :- " + list);

        System.out.println("Get Element:- ");
        int result = list.get(3);
        System.out.println(result);

        System.out.println("Remove Element :- ");
        int data = list.remove(2);
        System.out.println(data);
        System.out.println("Set element at index :- ");

        System.out.println( list.set(2,7));
        System.out.println(list);

//        contain
        System.out.println("Contain element in array :-");
        System.out.println(list.contains(7));
        System.out.println(list.contains(15));

        System.out.println("Adding element in array");
         list.add(1,8);
        System.out.println(list);

    }
}