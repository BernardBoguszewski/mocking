package pl.sdacademy.mocking.services;

import org.springframework.mail.MailMessage;
import org.springframework.stereotype.Service;
import pl.sdacademy.mocking.domain.User;
import pl.sdacademy.mocking.repositories.UserRepository;

@Service
public class UserService {

    private EmailService emailService;

    private UserRepository userRepository;

    public UserService(EmailService emailService, UserRepository userRepository) {
        this.emailService = emailService;
        this.userRepository = userRepository;
    }

    public MailMessage sendVerificationEmailToUser(User user) {
        return emailService.sendEmailVerification(user);
    }

    public User saveUser(User user) {
        //creating user logic
        return userRepository.save(user);
    }

    public void deleteUser(User user) {
        //deleting user logic
        userRepository.delete(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
