package Pattern.BehavioralPattern.TemplatePattern;

/**
 * Created by zhangjinqiang on 2017-11-1.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new BasketBall();
        game.play();


        System.out.println();
        game = new Football();
        game.play();
    }
}
