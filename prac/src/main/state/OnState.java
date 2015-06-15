package main.state;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class OnState implements LightState {
    @Override
    public void handleState(Light light) {
        System.out.println("灯开着了");
        light.setLightState(new OffState());
    }
}
