package main.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Main {
    public static void main(String[] args) {
        Observer user = new User();
        Observer user2 = new User2();
        Account account = new Account();

        account.addObserver(user);
        account.addObserver(user2);

        account.add(99.f);
    }
}
