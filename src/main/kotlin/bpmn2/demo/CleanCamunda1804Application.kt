package bpmn2.demo

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@EnableProcessApplication
@SpringBootApplication

class CleanCamunda1804Application

fun main(args: Array<String>) {
	runApplication<CleanCamunda1804Application>(*args)
}
