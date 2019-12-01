package com.tddexample.todo.service;

import com.tddexample.todo.entity.ToDo;
import com.tddexample.todo.repository.ToDoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ToDoServiceTest {

    @Autowired
    private ToDoRepository toDoRepository;

    @Test
    void getAllToDos() {
        ToDo toDoSample = new ToDo("ToDo Sample 1", true );
        toDoRepository.save(toDoSample);
        ToDoService toDoService = new ToDoService(toDoRepository);

        List<ToDo> toDoList = toDoService.findAll();
        ToDo lastToDo = toDoList.get(0);

        assertEquals(toDoSample.getText(), lastToDo.getText());
        assertEquals(toDoSample.isCompleted(), lastToDo.isCompleted());
        assertEquals(toDoSample.getId(), lastToDo.getId());

    }

}
