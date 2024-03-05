package com.polixis.task.service.impl;

import com.polixis.task.dto.TaskDataDTO;
import com.polixis.task.mapper.TaskDataMapper;
import com.polixis.task.model.TaskData;
import com.polixis.task.repository.TaskRepository;
import com.polixis.task.service.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    private final TaskDataMapper taskDataMapper;

    @Override
    public void saveConsumedData(TaskDataDTO data) {
        TaskData  taskData = this.taskDataMapper.TaskDataDTOTo(data);
        this.taskRepository.save(taskData);
    }
}
