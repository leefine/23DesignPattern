package Pattern.BehavioralPattern.CommandPattern;


/***
 * 电视机，本身具有开、关和更换频道功能
 */
public class Tv {

    private int currentChannel = 0;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public void turnOn() {
        System.out.println("The televisino is on.");
    }


    public void turnOff() {
        System.out.println("The television is off.");
    }


    public void changeChannel(int channel) {
        this.currentChannel = channel;
        System.out.println("Now TV channel is " + channel);
    }
}