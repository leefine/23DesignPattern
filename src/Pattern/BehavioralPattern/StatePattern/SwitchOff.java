package Pattern.BehavioralPattern.StatePattern;

public class SwitchOff implements LightState {
    /// <summary>
    /// 在开状态下，按下开关则切换到关的状态。
    /// </summary>
    /// <param name="light"></param>
    public void PressSwich(Light light) {
        System.out.println("Turn on the light.");

        light.setState(new SwitchOn());
    }
}