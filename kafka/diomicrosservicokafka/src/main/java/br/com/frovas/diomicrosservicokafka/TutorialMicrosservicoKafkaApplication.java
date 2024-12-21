package br.com.frovas.diomicrosservicokafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TutorialMicrosservicoKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialMicrosservicoKafkaApplication.class, args);
	}

}
