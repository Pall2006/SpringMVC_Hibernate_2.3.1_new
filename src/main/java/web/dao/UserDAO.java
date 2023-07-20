package web.dao;

import web.model.User;
import java.util.List;

public interface UserDAO {


    List<User> getAllUsers();

    void addUser(User user);

    void updateUserById(int id, User user);

    void deleteUserById(int id);

    User getUserById(int id);
}



