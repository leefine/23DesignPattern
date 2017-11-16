package Pattern.BehavioralPattern.CommandPattern;

/***
 * 遥控器：具有开、关和更换电视机频道的功能
 */
public class Controller {

    private Command onCommand, offCommand, changeChannel;


    public Controller(Command on, Command off, Command channel) {
        onCommand = on;
        offCommand = off;
        changeChannel = channel;
    }


    public void turnOn() {
        onCommand.execute();
    }


    public void turnOff() {
        offCommand.execute();
    }


    public void changeChannel() {
        changeChannel.execute();
    }


}