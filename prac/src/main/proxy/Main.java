package main.proxy;

import main.proxy.Car;
import main.proxy.Movable;
import main.proxy.TimeProxy;

import java.lang.reflect.Proxy;
import java.sql.SQLException;

/**
 * Created by Json Ding on 2015/5/19.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Car car = new Car();
        TimeProxy timeProxy = new TimeProxy();

        Movable movable = (Movable) Proxy.newProxyInstance(Car.class.getClassLoader(), Car.class.getInterfaces(), timeProxy);
        movable.move();
    }
}
