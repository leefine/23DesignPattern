package Pattern.StructPattern.FlyweightPattern;


import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式（英语：Flyweight Pattern）是一种软件设计模式。
 * 它使用共享物件，用来尽可能减少内存使用量以及分享资讯给尽可能多的相似物件；
 * 它适合用于只是因重复而导致使用无法令人接受的大量内存的大量物件。通常物件中的部分状态是可以分享。
 * 常见做法是把它们放在外部数据结构，当需要使用时再将它们传递给享元。
 * 内蕴状态存储在享元内部，不会随环境的改变而有所不同，是可以共享的
 * 外蕴状态是不可以共享的，它随环境的改变而改变的，因此外蕴状态是由客户端来保持（因为环境的变化是由客户端引起的）。
 *
 * 画笔工厂类 获取画笔存在直接返回 不存在创建添加至hashmap并返回;
 * 通过可以共享的属性颜色来进行享元，因此使用颜色作为主键及进行存储。
 * 其中粗细是跟随客户端进行选择。
 */
public class PenFactory {

    static HashMap<String, Draw> lsPen = new HashMap<>();

    public static Draw getPen(String color) {
        Draw pen = lsPen.get(color);
        if (pen == null) {
            if (color.equalsIgnoreCase("blue")) {
                pen = new BluePen();
            } else if (color.equalsIgnoreCase("red")) {
                pen = new RedPen();
            } else if (color.equalsIgnoreCase("yellow")) {
                pen = new YellowPen();
            } else return null;

            lsPen.put(color, pen);
        }
        return pen;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            RedPen redPen = (RedPen) PenFactory.getPen("red");
            redPen.setThinOrThink("thin");
            redPen.draw();
            redPen.setThinOrThink("thick");
            redPen.draw();

            BluePen bluePen = (BluePen) PenFactory.getPen("blue");
            bluePen.setThinOrThink("thin");
            bluePen.draw();
            bluePen.setThinOrThink("thick");
            bluePen.draw();

            YellowPen yellowPen = (YellowPen) PenFactory.getPen("yellow");
            yellowPen.setThinOrThink("thin");
            yellowPen.draw();
            yellowPen.setThinOrThink("thick");
            yellowPen.draw();
        }
        for (Map.Entry<String, Draw> map : lsPen.entrySet()) {
            System.out.println(map.getKey());
        }
    }
}
