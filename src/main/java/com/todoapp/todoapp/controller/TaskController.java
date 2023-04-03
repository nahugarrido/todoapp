package com.todoapp.todoapp.controller;

import com.todoapp.todoapp.dto.TaskInDTO;
import com.todoapp.todoapp.entity.Task;
import com.todoapp.todoapp.entity.TaskStatus;
import com.todoapp.todoapp.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody TaskInDTO taskInDTO) {
        return this.taskService.createTask(taskInDTO);
    }

    @GetMapping
    public List<Task> findAll() {
        return this.taskService.findAll();
    }

    @GetMapping(value = "/status/{status}")
    public List<Task> findAllByStatus(@PathVariable TaskStatus status) {
        return this.taskService.findAllByTaskStatus(status);
    }
}
