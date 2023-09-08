package web.dao;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceDAOTestArray implements UserServiceDAO {
    private static Long LASTID = 0L;
    private List<User> users;
    {
        users = new ArrayList<>();
        users.add(new User(++LASTID, "Vasya", "Bobikov"));
        users.add(new User(++LASTID, "Petya", "Sharikov"));
        users.add(new User(++LASTID, "Anton", "Golikov"));
        users.add(new User(++LASTID, "SirGey", "EltonJohn"));
        users.add(new User(++LASTID, "Anna", "Fridrehson"));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public void add(User user) {
        users.add(new User(++LASTID, user.getName(), user.getLastname()));
    }

    @Override
    public void update(Long id, User user) {
        getById(id).update(user);
    }

    @Override
    public void delete(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
