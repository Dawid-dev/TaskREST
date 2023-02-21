package pl.wsb.student.TaskREST.Task;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Database operations
@Repository
public class _TaskDAO {
    private static Map<Integer, TaskEntity> tasks;

    static{
        tasks = new HashMap<Integer,TaskEntity>(){
            {
                put(1, new TaskEntity(1,"Task 1", "First test task"));
            }
        };
    }

    public Collection<TaskEntity> getAllTasks(){
        return this.tasks.values();
    }
}
