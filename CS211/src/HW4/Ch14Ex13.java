package HW4;
/*
Tyler Choi
CS211 Winter Quarter
HW04
Ch14Ex13
02.02.20

This class contains exercise 13 in Chapter 14 of the textbook.
It contains the expunge method which sorts a Stack in non-descending order from top to bottom
 */

import java.util.Stack;

public class Ch14Ex13 {

    public static void main(String[] args) {

        int[] data = {4, 20, 15, 15, 8, 5, 7, 12, 3, 10, 5, 1};
        Stack<Integer> stack = new Stack<>();

        for (int i : data) { //push array values into stack
            stack.push(i);
        }

        System.out.println("Original list is : " + stack);
        System.out.println("Expunged list is : " + expunge(stack));

    }

    //method accepts a Stack as parameter and returns a sorted Stack in ascending order from top to bottom
    public static Stack<Integer> expunge (Stack<Integer> stack) {

        if (stack.size() < 2) {
            return stack; //return stack as is if size is less than 2
        }

        Stack<Integer> auxList = new Stack<>(); //auxiliary stack to push values that are popped from stack

        int n = stack.pop();
        auxList.push(n); //push the first integer into the auxiliary stack to peek in while loop

        while (!stack.isEmpty()) {
            int m = stack.pop(); //next integer from stack
            int o = auxList.peek(); //first value of 'o' will be equal to 'n'

            if (o <= m) {
                auxList.push(m); //only if popped int from stack is not less than peeked int
            }
        }

        while (!auxList.isEmpty()) { //restore values back to stack from auxiliary stack
            stack.push(auxList.pop());
        }
        return stack; //return stack that was originally accepted as parameter with expunged values

    }
}
