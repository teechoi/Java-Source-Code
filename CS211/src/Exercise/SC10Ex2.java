package Exercise;

import java.util.ArrayList;

public class SC10Ex2 {

    public static void main(String[] args) {

        String[] data1 = {"four", "score", "and", "seven", "years", "ago"};
        ArrayList<String> list1 = new ArrayList<>();
        for (String i : data1) {
            list1.add(i);
        }

        String[] data2 = {"to", "be", "or", "not", "to", "be", "hamlet"};
        ArrayList<String> list2 = new ArrayList<>();
        for (String i : data2) {
            list2.add(i);
        }

        swapPairs(list1);
        swapPairs(list2);

    }

    public static void swapPairs (ArrayList<String> list) {


        for (int i = 0; i < list.size()-1; i+=2) {

            String element = list.get(i);
            String element2 = list.get(i + 1);

            list.set(i, element2);
            list.set(i + 1, element);


        }
        System.out.println(list);

    }
}
