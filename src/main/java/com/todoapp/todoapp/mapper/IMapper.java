package com.todoapp.todoapp.mapper;

public interface IMapper <Input, Output>{
    Output map (Input in);
}
