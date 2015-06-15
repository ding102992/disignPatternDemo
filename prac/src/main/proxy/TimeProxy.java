package main.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Json Ding on 2015/6/6.
 */
public class TimeProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("汽车开始运行");
        long start = System.currentTimeMillis();
        Object obj = method.invoke(proxy, args);
        long end = System.currentTimeMillis();
        System.out.println("骑车结束运行，运行时间为："+(end-start)+"毫秒");
        return obj;
    }
}
