package project.service;

import org.springframework.stereotype.Service;
import project.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAll() {
        return List.of();
    }

    @Override
    public void create(User user) {

    }

    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public void remove(long id) {

    }
}
