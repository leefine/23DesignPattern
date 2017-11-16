package Pattern.StructPattern.FlyweightPattern;

/**
 * 粗笔 设置颜色后可以画画
 */
public class YellowPen implements Draw {

    private String thinOrThink;

    public String getThinOrThink() {
        return thinOrThink;
    }

    public void setThinOrThink(String thinOrThink) {
        this.thinOrThink = thinOrThink;
    }

    @Override
    public void draw() {
        if (thinOrThink.equals("thin"))
            System.out.println("Draw Yellow Color @ Thin");
        else
            System.out.println("Draw Yellow Color @ Think");
    }
}
