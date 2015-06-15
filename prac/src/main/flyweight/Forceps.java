package main.flyweight;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Forceps implements Util {

    public Forceps(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void use() {
        System.out.println("用了个钳子");
    }

    @Override
    public void putoff() {
        System.out.println("放下了钳子");
    }
}
