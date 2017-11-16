package Pattern.BehavioralPattern.StatePattern;

public class SwitchOn implements LightState {

    /// 在开状态下，按下开关则切换到关的状态。
    public void PressSwich(Light light) {
        System.out.println("Turn off the light.");
        light.setState(new SwitchOff());
    }
}