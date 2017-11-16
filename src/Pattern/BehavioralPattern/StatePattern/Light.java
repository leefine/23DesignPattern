package Pattern.BehavioralPattern.StatePattern;

/// 电灯类，对应模式中的Context类
public class Light {

    public Light(LightState state) {
        this.state = state;
    }

    private LightState state;

    public LightState getState() {
        return state;
    }

    public void setState(LightState state) {
        this.state = state;
    }

    /// <summary>
    /// 按下电灯开关
    /// </summary>
    public void PressSwich() {
        state.PressSwich(this);
    }
}