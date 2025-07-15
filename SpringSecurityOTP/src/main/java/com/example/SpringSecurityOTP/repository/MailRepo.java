package com.example.SpringSecurityOTP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringSecurityOTP.entity.Mail;

public interface MailRepo extends JpaRepository<Mail, Integer>{

}
