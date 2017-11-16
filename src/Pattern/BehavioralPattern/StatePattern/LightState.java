package Pattern.BehavioralPattern.StatePattern;


/// 抽象的电灯状态类，相当于State类
public interface LightState {
    void PressSwich(Light light);
}