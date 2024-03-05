package com.polixis.task.mapper;

import com.polixis.task.dto.TaskDataDTO;
import com.polixis.task.model.TaskData;
import org.springframework.stereotype.Service;

@Service
public class TaskDataMapper {

    public TaskData TaskDataDTOTo(TaskDataDTO taskDataDTO){
        return TaskData.builder()
                .name(taskDataDTO.getName())
                .userNumber(taskDataDTO.getUserNumber())
                .createdAt(taskDataDTO.getCreatedAt())
                .build();
    }
}
