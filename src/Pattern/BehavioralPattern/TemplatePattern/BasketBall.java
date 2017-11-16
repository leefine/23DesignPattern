package Pattern.BehavioralPattern.TemplatePattern;

/***
 * 篮球游戏
 */

public class BasketBall extends Game {
   @Override
   void endPlay() {
      System.out.println("BasketBall Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("BasketBall Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("BasketBall Game Started. Enjoy the game!");
   }
}