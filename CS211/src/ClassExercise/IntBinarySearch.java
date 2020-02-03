package ClassExercise;
/*
Tyler Choi
CS 211 Winter Quarter
In-Class Exercise 3
01.28.20

This class tests the Binary Search method of Arrays while implementing interface Comparable
 */

import java.util.Arrays;

public class IntBinarySearch implements Comparable<String> {
//     Returns the index of an occurrence of target in a,
//     or a negative number if the target is not found.
//     Precondition: elements of a are in sorted order

    public static void main(String[] args) {

        String[] a = new String[]{"Java", "department", "twenty", "quarter", "binary", "science", "Bellevue", "College"};

        Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);
        System.out.println("The sorted Array is: " + Arrays.toString(a));

        binarySearchResult(a, "department", binarySearch(a, "department"));

        binarySearchResult(a, "twenty", binarySearch(a, "twenty"));

        binarySearchResult(a, "recursive", binarySearch(a, "recursive"));
        


    }

    public static int binarySearch(String[] a, String target) {

        int min = 0;
        int max = a.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (a[mid].compareTo(target) < 0) {
                min = mid + 1;
            } else if (a[mid].compareTo(target) > 0) {
                max = mid - 1;
            } else {
                return mid;   // target found
            }
        }

        return -(min + 1);    // target not found
    }

    //method to print details from binarySearch method
    public static void binarySearchResult (String[] a, String target, int result){
        if (result>0){
            System.out.println("The target word \"" + target + "\" exists at index: " + binarySearch(a, target));
        } else {
            System.out.println("The target word \"" + target + "\" does not exist in this array." +
                    " If it did, it would be at index: " + Math.abs(binarySearch(a, target)+1));
        }
    }

    public int compareTo(String o) {
        return toString().compareTo(o);
    }



    //this method comparing the length of each String in the array also works

//    public static int binarySearch(String[] a, String target) {
//        int min = 0;
//        int max = a.length - 1;
//
//        while (min <= max) {
//            int mid = (min + max) / 2;
//            if (a[mid].length() < target.length()) {
//                min = mid + 1;
//            } else if (a[mid].length() > target.length()) {
//                max = mid - 1;
//            } else {
//                return mid;   // target found
//            }
//        }
//
//        return -(min + 1);    // target not found
//    }


}
