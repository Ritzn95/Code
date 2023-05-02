package com.Ritesh;

import java.util.*;

public class InBuiltStack {
    public static void main(String[] args) {
//        Stack <Integer> stack = new Stack<>();
//        stack.push(2);
//        stack.push(28);
//        stack.push(34);
//        stack.push(18);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        Queue <Integer> queue = new LinkedList<>();
//        queue.add(4);
//        queue.add(6);
//        queue.add(7);
//        queue.add(9);
//        queue.add(2);
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(45);
        deque.addLast(78);
        deque.addFirst(6);
        deque.removeFirst();
    }
}
