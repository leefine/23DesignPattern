package Pattern.BehavioralPattern.ChainOfResponsibility;

/**
 * 管理者抽象类
 */
public abstract class AbstractManager {

    private AbstractManager nextManager;

    public AbstractManager getNextManager() {
        return nextManager;
    }

    public void setNextManager(AbstractManager nextManager) {
        this.nextManager = nextManager;
    }

    protected abstract void handle(int leaveDays);
}
