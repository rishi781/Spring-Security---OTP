package com.example.SpringSecurityOTP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringSecurityOTP.entity.Mail;
import com.example.SpringSecurityOTP.service.MailService;

@Controller
public class MailController {

	@Autowired
	MailService service;
	
	String generatedOtp; // for demo only
	
	
	 @PostMapping("/send")
	    public String send(@ModelAttribute Mail mail) {
	        // 1. Generate and send OTP
	        generatedOtp = service.sendMail(mail); // make this return the generated OTP
	        return "validate"; // go to OTP entry page
	    }
	 

	    @PostMapping("/verify")
	    public String verify(@RequestParam String otp) {
	        // 2. Compare entered OTP
	        if (otp.equals(generatedOtp)) {
	            return "result"; // OTP matched
	        } else {
	            return "validate"; // wrong OTP, stay on same page
	        }
	    }
	
}