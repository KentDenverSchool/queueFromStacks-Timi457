/*
Timi Ryan
Advanced Topics Computer Science
Purpose: build a stack
20.9.18
*/

public class Stack {

    private int size;
    private node top;

    public Stack() {
        size = null;
        top = null;
    }

    public Stack(int i, node t, node r) {
        size = i;
        top = t;
    }

    void push(Object elem) { // add an element
        node ref = top;
        top = elem;
        top.setNext(ref);

    }

    Object pop() {// remove and return the top element
        node pop = top;
        top = pop.getNext();
        pop.setNext(null);
        return pop.getData();
    }

    boolean isEmpty() { // cheks if the stack is empty
        return (top == null);
    }

    int size() {
        return size;
    } // sets the size of the stack

    Object peek() {
        return top.getData();
    } // look at the top element without removing
}
