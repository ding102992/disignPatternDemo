package main.responsibilty;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Boy {
    private boolean hasMoney;
    private boolean hasCar;
    private boolean hasHouse;

    private Boy(){}

    public Boy(boolean hasMoney, boolean hasCar, boolean hasHouse) {
        this.hasMoney = hasMoney;
        this.hasCar = hasCar;
        this.hasHouse = hasHouse;
    }

    public boolean isHasMoney() {
        return hasMoney;
    }

    public void setHasMoney(boolean hasMoney) {
        this.hasMoney = hasMoney;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public boolean isHasHouse() {
        return hasHouse;
    }

    public void setHasHouse(boolean hasHouse) {
        this.hasHouse = hasHouse;
    }
}
