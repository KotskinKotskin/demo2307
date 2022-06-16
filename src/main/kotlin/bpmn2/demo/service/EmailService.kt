package bpmn2.demo.service

import org.simplejavamail.email.EmailBuilder
import org.simplejavamail.mailer.MailerBuilder
import org.springframework.stereotype.Service


@Service
class EmailService {

    fun sendEmail(to: String,
                  from: String,
                  subject: String,
                  text: String,
                  host: String,
                  port: Int,
                  userName: String,
                  password: String) {
        var email = EmailBuilder.startingBlank()
            .to(to)
            .from(from)
            .withSubject(subject)
            .withPlainText(text)
            .buildEmail()
        var mailer = MailerBuilder
            .withSMTPServer(host, port, userName, password)
            .clearEmailValidator()
            .buildMailer()

        mailer.sendMail(email)

    }
}