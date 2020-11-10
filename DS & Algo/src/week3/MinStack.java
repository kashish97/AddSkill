//https://leetcode.com/problems/min-stack/
package week3;

import java.util.*;

class MinStack {
    int min;
    List<Integer> list;

    /** initialize your data structure here. */
    public MinStack() {

        this.min = Integer.MAX_VALUE;
        this.list = new ArrayList<>();

    }

    public void push(int x) {
        list.add(x);

    }

    public void pop() {

        if(list.size()>0){
            list.remove(list.size()-1);
        }

    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        min = Integer.MAX_VALUE;
        for(int i = 0;i<list.size();i++){
            min = Math.min(min,list.get(i));
        }

        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
