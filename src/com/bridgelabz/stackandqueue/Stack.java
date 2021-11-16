package com.bridgelabz.stackandqueue;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

//    add an element `x` to the stack
    public void push(int x) { 
        Node node = new Node();

        if (node == null) {
            System.out.print("Heap Overflow");
            return;
        }
        System.out.println("Inserting " + x);
      
        node.data = x;    
        node.next = top;
        top = node;
    }

    // check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

   
    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("The stack is empty");
            return -1;
        }
    }
}