package tools.email;

import tools.models.MailReceiver;

import java.util.List;

public interface EmailService {

    public List<MailReceiver> getTheLastInboxEmails(String email, String password);

    public MailReceiver getTheLastEmailWithSubject(String email, String password, String subject);

}
