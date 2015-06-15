package main.responsibilty;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class MoneyResponse implements Response{

    private Response next;

    public MoneyResponse(Response res){
        next = res;
    }

    @Override
    public void deliverResponse(Boy boy) {
        if(boy.isHasMoney()){
            System.out.println("有钱呀，么么哒");
            if(next != null){
                next.deliverResponse(boy);
            }
        }else{
            System.out.println("没钱你说个jb");
        }
    }
}
