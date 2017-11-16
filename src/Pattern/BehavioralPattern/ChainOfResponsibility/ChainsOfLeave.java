package Pattern.BehavioralPattern.ChainOfResponsibility;

/**
 * 请假责任链
 */
public class ChainsOfLeave {

    public static AbstractManager getChainsOfManagers() {
        CEOManager ceo = new CEOManager();
        DeptManager dept = new DeptManager();
        DirectManager dirt = new DirectManager();

        dirt.setNextManager(dept);
        dept.setNextManager(ceo);

        return dirt;
    }

}
