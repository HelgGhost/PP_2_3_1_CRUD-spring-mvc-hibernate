package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User get(Long id);

    void add(User user);

    void update(Long id, User user);

    void delete(Long id);

}
