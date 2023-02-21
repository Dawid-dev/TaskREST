package pl.wsb.student.TaskREST.Task;

import jakarta.persistence.*;

@Entity
@Table
public class TaskEntity {

    @Id
    @SequenceGenerator(
            name="task_seq",
            sequenceName = "task_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "task_seq"
    )
    int id;
    String title;
    String description;

    public TaskEntity(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public TaskEntity(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public TaskEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TaskEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
