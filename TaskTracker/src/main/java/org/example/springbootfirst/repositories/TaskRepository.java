package org.example.springbootfirst.repositories;

import org.example.springbootfirst.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByStatus(String status);
}
