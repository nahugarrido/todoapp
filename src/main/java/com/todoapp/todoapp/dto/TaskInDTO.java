package com.todoapp.todoapp.dto;

import com.todoapp.todoapp.entity.TaskStatus;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskInDTO {
    private String title;
    private String description;
    private LocalDateTime eta;
}
