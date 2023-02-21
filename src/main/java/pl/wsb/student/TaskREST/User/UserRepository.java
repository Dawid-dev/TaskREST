package pl.wsb.student.TaskREST.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.wsb.student.TaskREST.Task.TaskEntity;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Query("SELECT t FROM UserEntity t WHERE t.login=?1")
    Optional<UserEntity> findUserByLogin(String login);
}
