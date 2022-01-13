//package com.bridgelabz.addressbookspring.utill;
//
//
//import com.bridgelabz.addressbookspring.model.Contact;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MailService {
//
//    private JavaMailSender mailSender;
//
//    @Autowired
//    public MailService(JavaMailSender mailSender){
//        this.mailSender=mailSender;
//    }
//
//    public void sendNotification(Contact contact){
//        SimpleMailMessage mailMessage=new SimpleMailMessage();
//        mailMessage.setTo(contact.getMail());
//        mailMessage.setFrom(".com");
//        mailMessage.setSubject("Send from JMS ");
//        mailMessage.setText("Successfull");
//        mailSender.send(mailMessage);
//    }
//
//}