package com.todoapp.todoapp.mapper;

import com.todoapp.todoapp.dto.TaskInDTO;
import com.todoapp.todoapp.entity.Task;
import com.todoapp.todoapp.entity.TaskStatus;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task>{

    @Override
    public Task map(TaskInDTO input) {
        Task task = new Task();
        task.setTitle(input.getTitle());
        task.setDescription(input.getDescription());
        task.setEta(input.getEta());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskstatus(TaskStatus.ON_TIME);
        return task;
    }
}
