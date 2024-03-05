package com.polixis.task.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDataDTO {

    private String name;
    private int userNumber;
    private String createdAt;

}
