package Homework04.Task01;

import java.util.LinkedList;
import java.util.Random;

public class program{
    static Random random = new Random();
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++){
            ll.add(random.nextInt(1, 100));
        }
        System.out.println(ll);
        LinkedList<Integer> reversed =reverseList(ll);
        System.out.println(reversed);
    }
    public static LinkedList<Integer> reverseList(LinkedList<Integer> ll){
        LinkedList<Integer> reversed = new LinkedList<Integer>();
        while(ll.size() != 0){
            reversed.add(ll.getLast());
            ll.removeLast();
        }
        return reversed;
    }
}