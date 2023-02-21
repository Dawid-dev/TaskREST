package pl.wsb.student.TaskREST.Task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.wsb.student.TaskREST.User.UserEntity;

import java.util.List;

//startup config
@Configuration
public class TaskConfig {
    @Bean
    CommandLineRunner taskBean(TaskRepository repository){
        return args -> {
            TaskEntity task1 = new TaskEntity("Hello", "Hello in TaskREST service");
            TaskEntity task2 = new TaskEntity("Test Task","Do Whatever you want with this task");

            repository.saveAll(List.of(task1, task2));
        };

    }
}
