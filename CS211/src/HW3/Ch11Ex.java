package HW3;
/*
Tyler Choi
CS211 Winter Quarter
HW03
01/26/20


This class consists of Chapter 11 exercises 05, 11, 13
Methods utilize idiosyncrasies of lists, sets, and maps
 */

import java.util.*;

public class Ch11Ex {

    public static void main(String[] args) throws IndexOutOfBoundsException {

        //Ch11Ex05
        List<Integer> list = Arrays.asList(7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9);
        System.out.println("Ch11Ex05");
        System.out.println("Original list: " + list);
        System.out.println("List sorted and duplicates removed: " + sortAndRemoveDuplicates(list));

        System.out.println("----------------");

        //Ch11Ex11
        TreeSet<Integer> firstSet = new TreeSet<>();
        TreeSet<Integer> secondSet = new TreeSet<>();

        int[] firstList = {1, 4, 7, 9};
        int[] secondList = {2, 4, 5, 6, 7};

        for (int i : firstList) { //add firstList into firstSet
            firstSet.add(i);
        }
        for (int i: secondList) { //add secondList into secondSet
            secondSet.add(i);
        }
        System.out.println("Ch11Ex11");
        System.out.println("First set: " + firstSet);
        System.out.println("Second set: " + secondSet);
        System.out.println("Symmetric set difference: " + symmetricSetDifference(firstSet, secondSet));

        System.out.println("----------------");

        //Ch11Ex13
        Map <String, String> map = new HashMap<>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Perkins");

        Map<String, String> otherMap = new HashMap<>();
        otherMap.put("Kendrick", "Perkins");
        otherMap.put("Stuart", "Reges");
        otherMap.put("Jessica", "Miller");
        otherMap.put("Bruce", "Reges");
        otherMap.put("Hal", "Perkins");

        System.out.println("Ch11Ex13");
        System.out.println("First map: " + map);
        System.out.println("Is this map unique? " + isUnique(map));
        System.out.println("Second map: " + otherMap);
        System.out.println("Is this map unique? " + isUnique(otherMap));

    }

    //this method is used in Ex05. It accepts a List and sorts and removes duplicate integers using a TreeSet
    public static TreeSet sortAndRemoveDuplicates (List<Integer> list) {

        return new TreeSet<>(list);

    }

    //this method is used in Ex11. It accepts 2 TreeSets and uses Set methods to remove overlapping integers
    public static TreeSet symmetricSetDifference (TreeSet<Integer> firstSet, TreeSet<Integer> secondSet) {

        Set<Integer> symmetry = new TreeSet<>(firstSet); //initialize a new set that contains firstSet, rather than combining directly
        symmetry.addAll(secondSet); //combines firstSet with secondSet values

        Set<Integer> overlap = new TreeSet<>(firstSet);
        overlap.retainAll(secondSet); //retains overlapping Set values

        symmetry.removeAll(overlap); //removes overlapping values from combined set
        return (TreeSet) symmetry; 

    }

    //this method is used in Ex13. It accepts a Map and creates a Set to eliminate duplicate values
    public static boolean isUnique (Map <String, String> map) {

        HashSet<String> unique = new HashSet<String>(map.values()); //Set accepts String values of Map

        return unique.size() == map.size(); //returns true if no duplicates exist in Map

    }




}
