package main.memo;

import main.observer.*;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Main {
    public static void main(String[] args) {
        Memory memory = new Memory();
        Account a = new Account();

        a.setMoney(12.0f);
        memory.push(a.save());
        System.out.println(a.toString());

        a.setMoney(25.0f);
        memory.push(a.save());
        System.out.println(a.toString());

        memory.get();
        a.restore(memory.get());
        System.out.println(a.toString());
    }
}
