package Project1;
/*
Team 3: Tyler Choi, Yeeun Choi, Jing Du, Mike Jansen, Grace Jun, Chris Lee
CS 211 Winter Quarter
Project 1
01/26/20

This class creates the instance and object of Person that will be utilized in the Family class
Contains String fields and an ArrayList for children
Prints royalty name along with maternal, paternal, children names
 */

import java.util.ArrayList;

public class Person {

    private String name;
    private String maternal;
    private String paternal;
    private ArrayList<String> children; //ArrayList to factor paternal/maternal having multiple children

    //constructor for Person
    public Person (String name) {
        this.name = name;
        maternal = "";
        paternal = "";
        children = new ArrayList<String>();
    }
    public String getName() {
        return name;
    }
    public void setMaternal(String maternal) {
        this.maternal = maternal;
    }
    public void setPaternal(String paternal) {
        this.paternal = paternal;
    }
    public void addChild(String child) {
        this.children.add(child);
    }
    public String toString() {
        return getFamily() ;
    }
    public String getFamily() {
        return  getMaternal() + getPaternal() + getChildren();
    }
    public String getMaternal() {
        return "Maternal line: \n\t" + this.name + "\n\t\t" + this.maternal + "\n";
    }
    public String getPaternal() {
        return "Paternal line: \n\t" + this.name + "\n\t\t" + this.paternal + "\n";
    }
    public String getChildren() {
        String childList = "Children:";
        for (int i = 0; i < children.size(); i++) {
            childList += "\n\t" + children.get(i) + " ";
        }
        return childList;
    }
}
