package Pattern.BehavioralPattern.StrategyPattern;

/**
 * 制作披萨方法
 */
public class MakePizza implements MakeFood {
    public void make() {
        System.out.println("Pizza Ok");
    }
}
