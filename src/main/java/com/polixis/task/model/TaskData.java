package com.polixis.task.model;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("test_data")
@Builder
public class TaskData {
    @Id
    private String id;
    private int userNumber;
    private String name;
    private String createdAt;
}
