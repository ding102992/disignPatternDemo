package main.single;

import java.util.Iterator;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Main {
    public static void main(String[] args) {
        BoyFriend boyFriend = BoyFriend.INSTANCE;
        boyFriend.whatsName();
        boyFriend.whatsName();
    }
}
