package Pattern.BehavioralPattern.MediatorPattern;

/**
 * Created by zhangjinqiang on 2017-11-1.
 */
public class Main {

    public static void main(String[] args) {

        Email emai163 = new Email();

        EmailUser xiaomi = new EmailUser(emai163, "xiaomi@163.com");
        EmailUser dadou = new EmailUser(emai163, "dadou@163.com");

        xiaomi.sendEmail("dadou@163.com", "nihao");

        dadou.sendEmail("xiaomi@163.com", "hi");


        dadou.sendEmail("@All", "Notice ALL");
    }
}
