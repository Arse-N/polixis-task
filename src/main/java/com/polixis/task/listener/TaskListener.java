package com.polixis.task.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.polixis.task.constants.KafkaTopic;
import com.polixis.task.dto.TaskDataDTO;
import com.polixis.task.service.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;


@Component
@RequiredArgsConstructor
@Slf4j
public class TaskListener {

    private final ObjectMapper objectMapper;
    private final TaskService taskService;

    @KafkaListener(topics = KafkaTopic.TASK_TOPIC, groupId = "${spring.kafka.consumer.group-id}" )
    public void receivedMessage(@RequestBody String data){
        log.info("consumed data from kafka");
        log.info("Received message: {}", data);
        try{
            TaskDataDTO taskDataDTO = objectMapper.readValue(data, TaskDataDTO.class);
            this.taskService.saveConsumedData(taskDataDTO);
        } catch (JsonProcessingException e){
            log.error("Error processing Kafka message: {}", e.getMessage());
        }
    }

}
