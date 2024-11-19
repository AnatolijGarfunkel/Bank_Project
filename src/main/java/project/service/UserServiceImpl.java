package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.entity.User;
import project.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public void create(User user) {

    }

    @Override
    public User getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void remove(long id) {

    }
}
