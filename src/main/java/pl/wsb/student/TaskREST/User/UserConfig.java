package pl.wsb.student.TaskREST.User;

import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

//startup config
@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner userBean(UserRepository repository){
        return args -> {
            UserEntity admin = new UserEntity("admin","admin","insight");
            UserEntity moderator = new UserEntity("moderator","moderator","modern");

            repository.saveAll(List.of(admin, moderator));
        };

    }
}
