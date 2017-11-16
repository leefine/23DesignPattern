package Pattern.BehavioralPattern.CommandPattern;


/***
 * 开电视机命令 作为开命令的传递者
 */
public class CommandOn implements Command {

    private Tv myTv;

    public CommandOn(Tv tv) {
        myTv = tv;
    }

    public void execute() {
        myTv.turnOn();
    }
}