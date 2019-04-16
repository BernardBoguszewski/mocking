package pl.sdacademy.mocking.services;

import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import pl.sdacademy.mocking.domain.User;

@Service
public class EmailService {

    public MailMessage sendEmailVerification(User user) {
        //sending mail logic
        return new SimpleMailMessage();
    }
}
