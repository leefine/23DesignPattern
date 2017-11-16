package Pattern.BehavioralPattern.TemplatePattern;


/***
 * 游戏模板抽象类，抽象具体行为，模板化统一方法
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }


}