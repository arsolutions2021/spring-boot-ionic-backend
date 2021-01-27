package br.com.arsolutions.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.arsolutions.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
