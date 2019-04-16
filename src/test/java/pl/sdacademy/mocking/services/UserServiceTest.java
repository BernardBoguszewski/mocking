package pl.sdacademy.mocking.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import pl.sdacademy.mocking.domain.User;
import pl.sdacademy.mocking.repositories.UserRepository;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    private UserService userService;

    @Mock
    private EmailService emailService;

    @Mock
    private UserRepository userRepository;

    @Before
    public void setUp() {
        userService = new UserService(emailService, userRepository);
    }

    @Test
    public void shouldSendEmailReturnsEmail() {
        User user = new User();
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        Mockito.when(emailService.sendEmailVerification(Mockito.any())).thenReturn(mailMessage);

        MailMessage result = userService.sendVerificationEmailToUser(user);

        assertEquals(mailMessage, result);
    }

    @Test
    public void shouldSaveUserCreateNewUser() {
        // TODO: 17.04.2019 zaimplementuj test metody saveUser() z wykorzystaniem mockowania UserRepository
    }

    @Test
    public void shouldDeleteUser() {
        // TODO: 17.04.2019 zaimplementuj test metody deleteUser() - mock UserRepository (doNothing() dla metod void)
    }

    @Test
    public void shouldGetUserFromRepository() {
        // TODO: 17.04.2019 zaimplementuj test getUser() - mock UserRepository
    }

}