package com.peterchao.SpringEmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class EmailController {

    @Autowired
    private EmailSenderService emailSenderService;

    @GetMapping("/mail")
    public String sendEmail(@RequestParam String toEmail,
                          @RequestParam String subject,
                          @RequestParam String body){
        String answer = emailSenderService.sendEmail(toEmail, subject, body);

        return "@@";
    }
}
