package Project1;
/*
Team 3: Tyler Choi, Yeeun Choi, Jing Du, Mike Jansen, Grace Jun, Chris Lee
CS 211 Winter Quarter
Project 1
01/26/20

This class scans the royalty database file and uploads names into an array list of Person objects
Searches for royalty name and family info based on client input value
Contains a sentinel to terminate program
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Family {

    public static final String SENTINEL = "END"; //to terminate program

    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new File("tudor.dat"));

        ArrayList<Person> list = new ArrayList<>();

        //generate person object and add to list
        while (file.hasNextLine()) {
            String currentName = file.nextLine();
            if (!currentName.equals(SENTINEL)) {
                Person royalty = new Person(currentName); //name from file becomes a Person object via Person class
                list.add(royalty);
            } else {
                break; //when file reaches "END"
            }
        }

        //set mother and father from list and add children to ArrayList
        while (file.hasNextLine()) {
            String newName = file.nextLine();
            if (!newName.equals(SENTINEL)) {
                String maternal = file.nextLine();
                String paternal = file.nextLine();

                for (int i = 0; i<list.size(); i++) {
                    Person royalty = list.get(i);

                    if (royalty.getName().equals(newName)) {//if name from ArrayList index matches name from 2nd part of file
                        royalty.setMaternal(maternal);
                        royalty.setPaternal(paternal);
                    }

                    if (royalty.getName().equals(maternal)) {
                        royalty.addChild(newName); //add child as child of current maternal in Person class
                    }

                    if (royalty.getName().equals(paternal)) {
                        royalty.addChild(newName); //add child as child of current paternal in Person class
                    }
                }

            } else {
                break; //when file reaches "END"
            }

        }

        Scanner input = new Scanner(System.in);
        System.out.print("Person's name? ");
        String inputName = input.nextLine();

        boolean doesNameExist = false; //boolean simplifies code to act based on boolean value

        while (!inputName.equals(SENTINEL)) {

            for (int i = 0; i < list.size(); i++) {
                Person royalty = list.get(i); //get person from ArrayList with added royalty

                if (royalty.getName().equals(inputName)) {
                    doesNameExist = true; //boolean is true when input name exists in the list
                    System.out.println(royalty.getFamily());
                }
            }

            if (!doesNameExist) { //if boolean is not true, the input name does not exist in the list
                System.out.println("Incorrect name. Person's name? (Type \"END\" to quit)");
                inputName = input.nextLine();

            } else {
                System.out.println("Person's name? (Type \"END\" to quit)");
                inputName = input.nextLine();
                doesNameExist = false; //boolean gets reset when program successfully runs
            }
        }

        System.out.println("Long Live the Queen!"); //end program
    }

}
