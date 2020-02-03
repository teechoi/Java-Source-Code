package ClassExercise;
/*
Tyler Choi
CS211 Winter Quarter
01.31.20
IC04 - Ch14Ex03

This class contains Exercise 03 of Chapter 14 utilizing properties of Stacks and Queues
The copyStack method creates an identical copy of the original Stack and restores the original to its original state.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ch14Ex03 {

    public static void main(String[] args) {

        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stack<Integer> stack = new Stack<>();

        for (int i : data) {
            stack.push(i);
        }

        System.out.println("Original stack: " + stack);
        System.out.println("Copy stack: " + copyStack(stack));
        System.out.println("Original stack restored: " + stack);


    }

    //method copies accepted stack and restores original stack to original state
    public static Stack<Integer> copyStack (Stack<Integer> stack) {
        Queue<Integer> aux = new LinkedList<>(); //storage queue
        Stack<Integer> copy = new Stack<>(); //identical copy

        while (!stack.isEmpty()) {
            copy.push(stack.pop());
        }
        while (!copy.isEmpty()) {
            aux.add(copy.pop());
        }

        while (!aux.isEmpty()) { //loop pushes aux values to both copy and stack
            int a = aux.peek();
            stack.push(aux.remove());
            copy.push(a);
        }

        return copy;


    }
}
