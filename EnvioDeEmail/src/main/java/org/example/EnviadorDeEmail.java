package org.example;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnviadorDeEmail {

    public static void main(String[] args) {
        try {
            Email email = new SimpleEmail();
            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator("seuemail@exemplo.com", "sua-senha-de-app-do-email"));
            email.setStartTLSEnabled(true);

            email.setFrom("seuemail@exemplo.com");
            email.setSubject("Algaworks Envio de Email");
            email.setMsg("Envio de email usando uma lib externa no curso algaworks");
            email.addTo("destinatario@exemplo.com");

            email.send();
            System.out.println("E-mail enviado com sucesso via Gmail!");

        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
