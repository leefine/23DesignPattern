package Pattern.BehavioralPattern.CommandPattern;


/***
 * 更换频道命令 作为更换频道命令的传递者
 */
public class CommandChangeChannel implements Command {
    private Tv myTv;

    private int channel;

    public CommandChangeChannel(Tv tv, int channel) {
        myTv = tv;
        this.channel = channel;
    }

    public void execute() {
        myTv.changeChannel(channel);
    }
}