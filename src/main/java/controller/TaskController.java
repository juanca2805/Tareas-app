package controller;

import models.task;
import service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public task createTask(@RequestBody task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public task updateTask(@PathVariable Long id, @RequestBody task taskDetails) {
        return taskService.updateTask(id, taskDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
