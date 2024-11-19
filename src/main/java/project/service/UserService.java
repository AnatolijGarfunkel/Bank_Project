package project.service;

import project.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(long id);

    User create(User user);

    void remove(long id);
}
