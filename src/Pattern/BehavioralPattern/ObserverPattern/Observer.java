package Pattern.BehavioralPattern.ObserverPattern;

/***
 * 观察者抽象类
 */

public abstract class Observer {
    protected WeatherSation weatherSation;

    public abstract void action();
}