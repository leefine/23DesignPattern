package Pattern.BehavioralPattern.CommandPattern;

/**
 * Created by zhangjinqiang on 2017-11-1.
 */
public class Main {

    public static void main(String[] args) {
        // 命令接收者
        Tv myTv = new Tv();

        // 开机命令
        CommandOn on = new CommandOn(myTv);
        // 关机命令
        CommandOff off = new CommandOff(myTv);
        // 频道切换命令
        CommandChangeChannel channel = new CommandChangeChannel(myTv, 2);
        // 命令控制对象
        Controller control = new Controller(on, off, channel);


        // 开机
        control.turnOn();
        // 切换频道
        control.changeChannel();
        // 关机
        control.turnOff();
    }
}
