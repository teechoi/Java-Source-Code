package Exercise;

import java.util.ArrayList;

public class SC10Ex8 {

    public static void main(String[] args) {

        String[] data = {"java", "computer", "science", "asdkfjasd"};

        ArrayList<String> list = new ArrayList<>();

        for (String i: data) {
            list.add(i);
        }

        System.out.println(maxLength(list));

    }

    public static int maxLength(ArrayList<String> list) {

        if (list.size() < 1) {
            return 0;
        }

        int max = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {

            max = Math.max(max, list.get(i).length());
        }

        return max;
    }
}
