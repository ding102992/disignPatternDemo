package main.observer;


import java.util.Observable;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Account extends Observable {

    private float mMoney = 0.0f;

    public void add(float money ){
        mMoney += money;
        this.setChanged();
        this.notifyObservers(mMoney);
    }
}
