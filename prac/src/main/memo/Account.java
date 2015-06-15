package main.memo;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Account {
    private float money;

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Record save(){
        return new Record(money);
    }

    public void restore(Record record){
        money = record.money;
    }

    @Override
    public String toString() {
        return "账户余额为:"+money;
    }
}
