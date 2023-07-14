package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    void updateUserById(int id, User user);
    void deleteUserById(int id);
    User getUserById(int id);


}