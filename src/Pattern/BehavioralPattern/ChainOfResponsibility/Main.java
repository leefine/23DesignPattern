package Pattern.BehavioralPattern.ChainOfResponsibility;

/**
 * 请假责任链
 */
public class Main {


    public static void main(String[] args) {
        AbstractManager abstractManager = ChainsOfLeave.getChainsOfManagers();
        System.out.println("--------请假一天");
        abstractManager.handle(1);

        System.out.println("--------请假2天");
        abstractManager.handle(2);

        System.out.println("--------请假3天");
        abstractManager.handle(3);

        System.out.println("--------请假4天");
        abstractManager.handle(4);
    }
}
