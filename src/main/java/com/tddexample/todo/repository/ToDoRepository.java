package com.tddexample.todo.repository;

import com.tddexample.todo.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("toDoRepository")
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
