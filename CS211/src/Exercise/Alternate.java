package Exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Alternate {

    public static void main(String[] args) {

        int[] l1 = {1, 2, 3, 4, 5};
        List<Integer> list1 = new ArrayList<>();

        for (int i : l1) {
            list1.add(i);
        }

        int[] l2 = {6, 7, 8, 9, 10, 11, 12};
        List<Integer> list2 = new ArrayList<>();

        for (int i: l2) {
            list2.add(i);
        }

        System.out.println(alternate(list1, list2));

    }

    public static List<Integer> alternate (List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();

        Iterator<Integer> itr1 = a.iterator();
        Iterator<Integer> itr2 = b.iterator();

        if (a.size() < b.size()) {

            while (itr2.hasNext()) {

                while (itr1.hasNext()) {
                    list.add(itr1.next());
                    list.add(itr2.next());
                }
                list.add(itr2.next());

            }
        } else if (a.size() > b.size()) {

            while (itr1.hasNext()) {
                while (itr2.hasNext()) {
                    list.add(itr1.next());
                    list.add(itr2.next());
                }
                list.add(itr1.next());
            }

        } else {
            while (itr1.hasNext()) {
                list.add(itr1.next());
                list.add(itr2.next());

            }
        }
        return list;
    }
}
