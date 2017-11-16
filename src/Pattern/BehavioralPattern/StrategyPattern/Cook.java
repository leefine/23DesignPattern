package Pattern.BehavioralPattern.StrategyPattern;

/**
 * 厨师类根据客人告诉我的食物类型选择不同的做法进行制作食物
 */
public class Cook {
    private MakeFood makeFood;

    public Cook(MakeFood makeFood) {
        this.makeFood = makeFood;
    }

    public void setMakeFood(MakeFood makeFood) {
        this.makeFood = makeFood;
    }

    public void make() {
        this.makeFood.make();
    }

    public static void main(String[] args) {
        System.out.println("第一位客人需要吃披萨");
        Cook cook = new Cook(new MakePizza());
        cook.make();


        System.out.println("第二位客人需要吃意大利面");
        cook.setMakeFood(new MakePasta());
        cook.make();
    }
}
