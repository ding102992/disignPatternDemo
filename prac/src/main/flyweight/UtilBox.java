package main.flyweight;

import java.util.Hashtable;

/**
 * Created by Json Ding on 2015/6/15.
 */
public enum UtilBox {

    INSTANCE;

    UtilBox() {
        utilBoxTable =  new Hashtable<>();
    }
    private Hashtable<String,Util> utilBoxTable;

    public Util getUtil(String utilName){
        Util util = utilBoxTable.get(utilName);
        if(util != null){
            return util;
        }
        if("wrench".equals(utilName)){
            util = new Wrench();
            utilBoxTable.put("wrench",util);
        }else if("forceps".equals(utilName)){
            util = new Forceps();
            utilBoxTable.put("forceps",util);
        }else{
            throw new IllegalArgumentException("utilName is not exists");
        }
        return util;
    }
}
