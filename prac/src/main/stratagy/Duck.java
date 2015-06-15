package main.stratagy;

/**
 * Created by Json Ding on 2015/6/15.
 */
public abstract class Duck {

    public void swim(){
        System.out.println(this.getClass().getSimpleName()+"游啊游");
    }

    public abstract void dispaly();
}
