package main.flyweight;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Main {
    public static void main(String[] args) {
        //通过观察，发现加载时间明显改变了
        UtilBox.INSTANCE.getUtil("wrench").use();
        UtilBox.INSTANCE.getUtil("wrench").use();

        UtilBox.INSTANCE.getUtil("forceps").use();
        UtilBox.INSTANCE.getUtil("forceps").use();

    }
}
