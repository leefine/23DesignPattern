package Pattern.StructPattern.FlyweightPattern;

/**
 * 细笔 设置颜色后可以画画
 */
public class BluePen implements Draw {

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
            System.out.println("Draw Blue Color @ Thin");
        else
            System.out.println("Draw Blue Color @ Think");
    }


}
