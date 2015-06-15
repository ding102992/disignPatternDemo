package main.responsibilty;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class HouseResponse implements Response{

    private Response next;

    public HouseResponse(Response res){
        next = res;
    }

    @Override
    public void deliverResponse(Boy boy) {
        if(boy.isHasHouse()){
            System.out.println("有房呀，么么哒");
            if(next != null){
                next.deliverResponse(boy);
            }
        }else{
            System.out.println("没房你说个jb.");
        }
    }
}
