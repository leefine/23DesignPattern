package Pattern.BehavioralPattern.IteratorPattern;

/**
 * Created by zhangjinqiang on 2017-11-1.
 */
public class Main {
    public static void main(String[] args) {
        TeacherAggreagate c = new TeacherAggreagate();

        Iterator iterator = c.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
