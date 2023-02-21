package pl.wsb.student.TaskREST.User;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Database operations
@Repository
public class _UserDAO {
    private static Map<Integer,UserEntity> users;

    static{
        users = new HashMap<Integer,UserEntity>(){
            {
                put(1, new UserEntity(1, "Admin", "Admin", "Insight"));
            }
        };
    }

    public Collection<UserEntity> getAllUsers(){
        return this.users.values();
    }
}
