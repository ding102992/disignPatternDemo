package main.memo;

import java.util.Stack;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Memory {
    private Stack<Record> memo;

    public Memory(){
        memo = new Stack<>();
    }

    public Record get(){
        return memo.pop();
    }

    public void push(Record r){
        memo.push(r);
    }
}
