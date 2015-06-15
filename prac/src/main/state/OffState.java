package main.state;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class OffState implements LightState {
    @Override
    public void handleState(Light light) {
        System.out.println("灯关了");
        light.setLightState(new OnState());
    }
}
