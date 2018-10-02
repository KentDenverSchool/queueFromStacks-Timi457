/*
* StacksToQueueDriver
* Purpose: The goal is to test StacksToQueue
* 9/30/18
*/

public class StacksToQueueDriver {
    public static void main(String[] args) {
        StacksToQueue stq = new StacksToQueue();
        System.out.println("The size should be 0");
        System.out.print("The size is:");
        System.out.println(stq.size());
        System.out.println("Should not be empty");
        System.out.print("is empty:");
        System.out.println(stq.isEmpty());

        stq.enqueue(1);
        stq.enqueue(2);

        System.out.println("The size should be 2");
        System.out.print("The size is");
        System.out.println(stq.size());
        System.out.println("Should not be empty");
        System.out.println("is empty:");
        System.out.println(stq.isEmpty());

        stq.enqueue(3);
        stq.enqueue(4);

        System.out.println("The size should be 4");
        System.out.print("The size is");
        System.out.println(stq.size());
        System.out.println("Should not be empty");
        System.out.print("is empty:");
        System.out.println(stq.isEmpty());

        System.out.println(stq.dequeue());
        System.out.println(stq.dequeue());
        System.out.println(stq.dequeue());
        System.out.println(stq.dequeue());

        System.out.println("The size should be 0");
        System.out.print("The size is");
        System.out.println(stq.size());
        System.out.println("Should be empty");
        System.out.print("is empty:");
        System.out.println(stq.isEmpty());

    }
}