package Pattern.BehavioralPattern.ChainOfResponsibility;

/**
 * CEO
 */
public class CEOManager extends AbstractManager {
    @Override
    protected void handle(int leaveDays) {
        System.out.println("CEO：");
        System.out.println("批准请假");

        if (this.getNextManager() != null)
            this.getNextManager().handle(leaveDays);
    }
}
