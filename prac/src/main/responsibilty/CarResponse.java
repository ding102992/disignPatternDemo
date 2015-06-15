package main.responsibilty;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class CarResponse implements Response{

    private Response next;

    public CarResponse(Response res){
        next = res;
    }

    @Override
    public void deliverResponse(Boy boy) {
        if(boy.isHasCar()){
            System.out.println("有车呀，么么哒");
            if(next != null){
                next.deliverResponse(boy);
            }
        }else{
            System.out.println("没车你说个jb");
        }
    }
}
