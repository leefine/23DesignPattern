package Pattern.BehavioralPattern.ChainOfResponsibility;

/**
 * 部门经理
 */
public class DeptManager extends AbstractManager {
    @Override
    protected void handle(int leaveDays) {
        System.out.println("部门经理：");
        if (leaveDays <= 3) {
            System.out.println("批准请假");
        } else {
            System.out.println("批准请假");

            if (this.getNextManager() != null)
                this.getNextManager().handle(leaveDays);
        }
    }
}
