package tools.email;

import tools.models.MailReceiver;

import java.util.List;

public class EmailProcessor {
    private EmailService emailService;

    public EmailProcessor(EmailService emailService) {
        this.emailService = emailService;
    }

    public List<MailReceiver> getTheLastInboxEmails(String email, String password) {
        return this.emailService.getTheLastInboxEmails(email, password);
    }

    public MailReceiver getTheLastEmailWithSubject(String email, String password, String subject) {
        return this.emailService.getTheLastEmailWithSubject(email, password, subject);
    }

}
