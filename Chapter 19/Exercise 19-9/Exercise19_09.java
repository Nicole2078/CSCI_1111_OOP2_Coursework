/*
Author: Nicole Hackler
Date: 10/18/2023

Description:
Programming Exercise 19-9
(Sort ArrayList) Write the following method that sorts an ArrayList. Use Exercise19_09
as the test class.
*/
import java.util.ArrayList;

public class Exercise19_09 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(4);
        list.add(42);
        list.add(5);
        sort(list);

        ArrayList<String> names = new ArrayList<String>();
        names.add("George");
        names.add("Fred");
        names.add("Bob");
        names.add("Jason");
        names.add("Nicole");
        sort(names);

        System.out.print(list);
        System.out.print(names);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        //This loop only controls it for the length to the arraylist
        for (int i = 0; i < list.size(); i++) {
            //Comparing the first number to the second... then the second to the third...
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    E min = list.get(j); //Storing the min to a temp element
                    //Swapping the first with the second
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, min);
                }
            }
        }
    }
}
