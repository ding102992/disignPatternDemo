package main.flyweight;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Wrench implements Util {

    public Wrench(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void use() {
        System.out.println("用了个扳手");
    }

    @Override
    public void putoff() {
        System.out.println("放下了钳子");
    }
}
