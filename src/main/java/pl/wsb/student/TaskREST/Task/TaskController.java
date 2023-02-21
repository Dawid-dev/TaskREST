package pl.wsb.student.TaskREST.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path="tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;
    @GetMapping(path="/all")
    public List<TaskEntity> getAllTasks(){
        return this.taskService.getAllTasks();
    }

    @PostMapping(path="/new")
    public void addNewTask(@RequestBody TaskEntity task){
        taskService.addNewTask(task);
    }

    @DeleteMapping(path="/del/{taskId}")
    public void deleteTask(@PathVariable("taskId") int taskId){
        taskService.deleteTask(taskId);
    }
}
