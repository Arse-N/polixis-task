package com.polixis.task.repository;

import com.polixis.task.model.TaskData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<TaskData, String> {

}
