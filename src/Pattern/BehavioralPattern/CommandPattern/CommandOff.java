package Pattern.BehavioralPattern.CommandPattern;


/***
 * 关电视机命令 作为关命令的传递者
 */
public class CommandOff implements Command {
    private Tv myTv;

    public CommandOff(Tv tv) {
        myTv = tv;
    }

    public void execute() {
        myTv.turnOff();
    }
}