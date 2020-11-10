//https://leetcode.com/problems/implement-queue-using-stacks/

package week3;

import java.util.*;

class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int top = 0;
    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack1.empty()){
            top = x;
        }
        stack1.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(stack1.size()>1){
            top = stack1.pop();
            stack2.add(top);

        }


        int popped =  stack1.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }

        return popped;

    }

    /** Get the front element. */
    public int peek() {
        return top;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */