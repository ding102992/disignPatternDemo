package main.responsibilty;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Main {
    public static void main(String[] args) {
        Gril gril = new Gril();
        Boy boy = new Boy(false,true,false);
        gril.date(boy);
    }
}
