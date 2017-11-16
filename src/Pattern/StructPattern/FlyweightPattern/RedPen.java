package Pattern.StructPattern.FlyweightPattern;

/**
 * 粗笔 设置颜色后可以画画
 */
public class RedPen implements Draw {

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
            System.out.println("Draw Red Color @ Thin");
        else
            System.out.println("Draw Red Color @ Think");
    }

}
