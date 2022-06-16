package bpmn2.demo.service

import org.camunda.bpm.engine.RuntimeService
import org.springframework.stereotype.Service

@Service
class CamundaMessageService(private val api: RuntimeService) {


    fun sendMessage(messageName: String , payload: Map<String, *>) {
        api.correlateMessage("MyMessageAwait",payload)
    }
}