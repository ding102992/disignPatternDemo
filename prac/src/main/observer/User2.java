package main.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class User2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("存款变了，通知User2，存款为"+arg);
    }
}
