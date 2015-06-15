package main.stratagy;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class WildDuck extends Duck {

    private FlyStratagy fly;

    public WildDuck(){
        fly = new FlyWithWin();
    }

    @Override
    public void dispaly() {
        System.out.println("灰色的鸭子");
    }

    public void fly(){
        fly.fly();
    }
}
