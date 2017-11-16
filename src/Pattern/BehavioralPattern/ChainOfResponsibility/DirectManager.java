package Pattern.BehavioralPattern.ChainOfResponsibility;

/**
 * 直属领导
 */
public class DirectManager extends AbstractManager {

    @Override
    protected void handle(int leaveDays) {
        System.out.println("直属领导：");
        if (leaveDays <= 1) {
            System.out.println("批准请假");
        } else {
            System.out.println("批准请假");

            if (this.getNextManager() != null)
                this.getNextManager().handle(leaveDays);
        }
    }
}
