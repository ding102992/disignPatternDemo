package main.single;

/**
 * Created by Json Ding on 2015/6/15.
 */
public enum  BoyFriend  {
    INSTANCE;

    public void whatsName() {
        System.out.println("code:" + this.hashCode());
    }

}
