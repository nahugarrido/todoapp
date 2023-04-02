package com.todoapp.todoapp.service;

import com.todoapp.todoapp.dto.TaskInDTO;
import com.todoapp.todoapp.entity.Task;
import com.todoapp.todoapp.entity.TaskStatus;
import com.todoapp.todoapp.mapper.TaskInDTOToTask;
import com.todoapp.todoapp.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskService {

    // Esta es otra forma de inyectar dependencias (16,17,20,21)
    // se conoce como inyeccion de dependencias basada en constructor
    private final TaskRepository repository;
    private final TaskInDTOToTask mapper;

    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskInDTO) {
        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);
    }
}
