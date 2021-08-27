package tools.models;

import org.junit.Assert;
import tools.email.EmailProcessor;
import tools.email.GmailService;

public class MailReceiver {
    private String sender;
    private String subject;
    private String mailContent;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }
    public static void verifyLastEmail(String email, String password) throws InterruptedException {
        EmailProcessor emailProcessor = new EmailProcessor(new GmailService());
        int numberOfTries = 0;
        boolean isFound = false;
        while (numberOfTries != 30 && !isFound) {
            numberOfTries++;
            MailReceiver mail = emailProcessor.getTheLastEmailWithSubject(email, password, "Alertă de securitate critică" );
            if (mail != null) {
                System.out.println("Email found");
                isFound = true;
                break;
            }
            Thread.sleep(5000);

        }
        Assert.assertTrue(isFound);
    }
}
