package HW4;
/*
Tyler Choi
CS211 Winter Quarter
HW04
Ch14Ex06
02.02.20

This class contains exercise 06 in Chapter 14 of the textbook.
It contains the rearrange method that utilizes a Queue and Stack to rearrange a list of values
Queue is returned with even integers in the front and odd integers in the back
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ch14Ex06 {

    public static void main(String[] args) {

        int[] data = {3, 5, 4, 17, 6, 83, 1, 84, 16, 37};

        Queue<Integer> queue = new LinkedList<>();
        for (int i : data) { //add array values to linked list
            queue.add(i);
        }
        System.out.println("The original list is " + queue);
        System.out.println("The rearranged list is " + rearrange(queue));

    }

    //method accepts a Queue and returns the rearranged Queue
    public static Queue<Integer> rearrange (Queue<Integer> queue) {
        Stack<Integer> auxList = new Stack<>(); //auxiliary Stack to push values removed from queue
        int originalSize = queue.size(); //originalSize to prevent indexOutOfBoundsException

        for (int i = 0; i < originalSize; i++) {
            int n = queue.remove();
            if (n % 2 != 0) {
                auxList.push(n); //if odd int, push to auxiliary Stack
            } else {
                queue.add(n); //if even int, add to back of queue
            }
        }
        queue.addAll(auxList); //add all removed odd integers back to queue in FIFO order
        return queue; //return queue that was originally accepted with rearranged values
    }
}
