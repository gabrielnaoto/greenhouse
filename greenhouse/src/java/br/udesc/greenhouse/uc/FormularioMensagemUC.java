/*
UC007 Formulários de mensagem da página inicialo.
https://www.google.com/settings/u/1/security/lesssecureapps
Para este formulario funcionar deve ser acessado o link acima para ativar as lesssecureapps;
 */
package br.udesc.greenhouse.uc;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author sila
 */
public class FormularioMensagemUC {

    public void enviarEmail(String assunto, String corpo, String nome,String emailOrigem) {
        System.out.println("Email sending method");
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("greenhouseproject192@gmail.com", "greenhouse123");
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailOrigem));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("sila.siebert@gmail.com"));
            message.setSubject(assunto);
            message.setText("Email enviado por:"+ nome+"\nConteudo: \n"+corpo);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            System.out.println(e);
        }
    }
}
