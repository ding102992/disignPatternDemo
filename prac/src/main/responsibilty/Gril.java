package main.responsibilty;

import java.util.logging.Handler;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Gril {

    public void date(Boy boy){
        Response r = new CarResponse(new HouseResponse(new MoneyResponse(null)));
        r.deliverResponse(boy);
    }
}
