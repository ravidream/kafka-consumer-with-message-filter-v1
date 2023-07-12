package com.example.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	@KafkaListener(topics = "test", groupId = "test-group")
	public void listener(ConsumerRecord<String, String> consumerRecord) {
	    System.out.println("Received Message : "+ consumerRecord.key() + "  value : " + consumerRecord.value());
	}
}

