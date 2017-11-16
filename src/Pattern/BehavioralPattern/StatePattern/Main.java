package Pattern.BehavioralPattern.StatePattern;

/**
 * Created by zhangjinqiang on 2017-11-2.
 */
public class Main {

    public static void main(String[] args) {
        Light light = new Light(new SwitchOn());

        light.PressSwich();
        light.PressSwich();
        light.PressSwich();
        light.PressSwich();
    }
}
