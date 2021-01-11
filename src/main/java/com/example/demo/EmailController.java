package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping("/")
    public String sendEmail() throws MessagingException {
        try {
            emailService.sendEmail();
            return "Email envoyé :)";
        } catch(Throwable throwable) {
            return "Impossible d'envoyer le mail : " + throwable.getMessage();
        }
    }
}
