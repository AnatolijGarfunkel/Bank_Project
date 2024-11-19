package project.service;

import project.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    void create(User user);

    User getById(long id);

    void remove(long id);
}
