package com.todoapp.todoapp.repository;

import com.todoapp.todoapp.entity.Task;
import com.todoapp.todoapp.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> findAllByTaskstatus(TaskStatus status);
}
