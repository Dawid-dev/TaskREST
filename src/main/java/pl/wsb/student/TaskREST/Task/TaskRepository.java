package pl.wsb.student.TaskREST.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity,Integer> {

    @Query("SELECT t FROM TaskEntity t WHERE t.id=?1")
    Optional<TaskEntity> findTaskById(int id);
}
