package pl.wsb.student.TaskREST.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskEntity> getAllTasks(){
        return taskRepository.findAll();
    }

    public void addNewTask(TaskEntity task) {
        Optional<TaskEntity> taskById = taskRepository.findTaskById(task.getId());
        if (taskById.isPresent()){
            throw new IllegalStateException("Name taken");
        }
        taskRepository.save(task);
        System.out.println(task);
    }

    public void deleteTask(int taskId) {
        boolean exists = taskRepository.existsById(taskId);
        if (!exists){ throw new IllegalStateException("Task with id "+taskId+" does not exists");}
        taskRepository.deleteById(taskId);

    }

//    private TaskDAO taskDAO;
//    public Collection<TaskEntity> getAllUsers(){
//        return this.taskDAO.getAllTasks();
//    }
}
