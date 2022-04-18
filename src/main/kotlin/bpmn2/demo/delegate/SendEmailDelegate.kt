package bpmn2.demo.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import bpmn2.demo.service.EmailService


@Component("sendEmailDelegate")
class SendEmailDelegate(private val emailService: EmailService): JavaDelegate {

    override fun execute(p0: DelegateExecution) {

        var to = p0.getVariable("to") as String
        var from = p0.getVariable("from") as String
        var subject = p0.getVariable("subject") as String
        var text = p0.getVariable("text") as String
        var host = p0.getVariable("host") as String
        var port = (p0.getVariable("port") as String).toInt()
        var username = p0.getVariable("username") as String
        var password = p0.getVariable("password") as String
       emailService.sendEmail(to, from, subject,text, host, port, username, password )
    }
}