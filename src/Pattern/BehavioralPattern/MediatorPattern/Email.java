package Pattern.BehavioralPattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 邮件服务 可以添加用户 可以发送邮件，邮件服务收到邮件时会通知接收者
 */
public class Email {

    private List<EmailUser> users = new ArrayList<>();

    public void addUser(EmailUser emailUser) {
        if (!users.contains(emailUser))
            users.add(emailUser);
    }

    public void sendEmail(String sender, String receiver, String msg) {

        System.out.println(sender + " Send EMAIL:" + msg + " to " + receiver);


        for (EmailUser emailUser : users) {
            if (emailUser.getEmailAddress().equals(receiver) || "@All".equals(receiver)) {
                emailUser.getEmail(sender, msg);
            }

        }
    }
}
