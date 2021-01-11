package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    /**
     * Envoie un mail de test.
     */
    public void sendEmail() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setTo("adresse-destinataire@xxx.xx");
        helper.setSubject("Test d'envoi de mail");
        helper.setText("Hello, ceci est un test.", "<b>Hello</b>, ceci est un test.");
        javaMailSender.send(mimeMessage);
    }
}
