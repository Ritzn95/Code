package com.Ritesh;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new DynamicQueue(5);
        queue.insert(5);
        queue.insert(8);
        queue.insert(12);
        queue.insert(15);
        queue.insert(32);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();

    }
}
