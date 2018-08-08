package com.sushma.springweb.flight.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {
	
	@Autowired
	private JavaMailSender sender;
	
	public void sendEmail(String toAddress, String attachmentFilePath) {
		MimeMessage mime = sender.createMimeMessage();
		
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(mime, true);
			helper.setTo(toAddress);
			helper.setSubject("Your Flight Iternary");
			helper.addAttachment("Iternanary", new File(attachmentFilePath));
			helper.setText("Please find your iternary attached");
			sender.send(mime);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		
	}
}
