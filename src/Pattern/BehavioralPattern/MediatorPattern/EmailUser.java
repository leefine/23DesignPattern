package Pattern.BehavioralPattern.MediatorPattern;

/**
 * 邮箱用户 可以发信 接收信
 */
public class EmailUser {
    private Email email;
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public EmailUser(Email email, String emailAddress) {
        this.emailAddress = emailAddress;
        this.email = email;
        this.email.addUser(this);
    }


    public void sendEmail(String receiver, String msg) {
        email.sendEmail(this.emailAddress, receiver, msg);
    }

    public void getEmail(String sender, String msg) {
        System.out.println(this.getEmailAddress() + ":AHA,Get email " + msg
                + " from " + sender);
    }

}
