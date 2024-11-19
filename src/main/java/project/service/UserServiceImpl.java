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


//  @GET ---------------------------------------------------------------------------------------------------------------

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getById(long id) {
        return repository.findById(id).get();
    }

//  @POST --------------------------------------------------------------------------------------------------------------

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User remove(long id) {
        User user = repository.findById(id).get();
        repository.delete(user);
        return user;
    }
}
