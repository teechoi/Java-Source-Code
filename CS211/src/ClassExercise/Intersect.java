package ClassExercise;

import java.util.ArrayList;

public class Intersect {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

//        List<Integer> list = Arrays.asList(1,4,8,9,11,15);
//        System.out.println(list);

        int[] listOne = {1, 4, 8, 9, 11, 15, 17, 28, 41, 59};
        int[] listTwo = {4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81};

        for (int i : listOne){
            list1.add(i);
        }
        for (int i : listTwo){
            list2.add(i);
        }
        System.out.println("List 1 is " + list1);
        System.out.println("List 2 is " + list2);
        System.out.println("Intersected list is  " + intersect(list1, list2));

    }

    private static ArrayList intersect(ArrayList<Integer> l1, ArrayList<Integer> l2){
        ArrayList<Integer> list3 = new ArrayList<>();

        if (l1.size()>=l2.size()){
            for (int number : l1) {
                if (l2.contains(number)) {
                    list3.add(number);
                }
            }
        } else {
            for (int number : l2) {
                if (l1.contains(number)) {
                    list3.add(number);
                }
            }
        }
        return list3;
    }
}
