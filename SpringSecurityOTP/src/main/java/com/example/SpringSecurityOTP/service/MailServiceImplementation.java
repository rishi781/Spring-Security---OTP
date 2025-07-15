package com.example.SpringSecurityOTP.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityOTP.entity.Mail;
import com.example.SpringSecurityOTP.repository.MailRepo;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailServiceImplementation implements MailService {
	
	@Autowired
	MailRepo repo;

	@Autowired
	JavaMailSender sender;
	public String sendMail(Mail mail) {
		String otp = String.format("%06d", new Random().nextInt(999999));
		
		MimeMessage msg = sender.createMimeMessage();
		MimeMessageHelper mmh = 
				new MimeMessageHelper(msg,"utf-8");
		try {
			mmh.setTo(mail.getReceiver());
			mmh.setSubject("OTP");
			mmh.setText("Use this otp: " + otp);
			
			sender.send(msg);
			//repo.save(mail);
		} 
		catch (MessagingException e) {
			e.printStackTrace();
		}
		return otp;
	}
}
	
	
