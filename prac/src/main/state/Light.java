package main.state;

/**
 * Created by Json Ding on 2015/6/15.
 */
public class Light {
    private LightState lightState;

    public Light(){
        lightState = new OffState();
    }
    public void setLightState(LightState ls){
        lightState = ls;
    }

    public void switcher(){
        lightState.handleState(this);
    }
}
