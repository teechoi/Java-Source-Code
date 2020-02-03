package Exercise;

import java.util.ArrayList;

public class SC10Ex15 {

    public static void main(String[] args) {

        int[] data = {30, 20, 10, 60, 50, 40};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : data) {
            list.add(i);
        }
        int[] data2 = {-4, 16, 9, 1, 64, 25, 36, 4, 49};
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i : data2) {
            list2.add(i);
        }

        mystery1(list);
        mystery1(list2);

        int[] data3 = {10, 20, 30};
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i : data3) {
            list3.add(i);
        }

        int[] data4 = {8, 2, 9, 7, 4};
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i : data4) {
            list4.add(i);
        }

        mystery2(list3);
        mystery2(list4);


        int[] data5 = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i : data5) {
            list5.add(i);
        }

        mystery3(list5);
    }

    public static void mystery1(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) < list.get(i-1)) {
                int element = list.get(i);
                list.remove(i);
                list.add(0, element);
            }

        }
        System.out.println(list);
    }

    public static void mystery2(ArrayList<Integer> list) {
        for (int i = list.size()-1; i>=0; i--) {
            if (i%2 == 0) {
                list.add(list.get(i));
            } else {
                list.add(0, list.get(i));
            }
        }
        System.out.println(list);
    }

    public static void mystery3(ArrayList<Integer> list) {
        for (int i = list.size() - 2; i > 0; i--) {
            int a= list.get(i);
            int b = list.get(i+1);
            list.set(i, a+b);
        }
        System.out.println(list);
    }

}
