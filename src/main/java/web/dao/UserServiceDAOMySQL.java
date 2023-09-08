package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserServiceDAOMySQL implements UserServiceDAO {
    private final LocalContainerEntityManagerFactoryBean entityManager;
    @Autowired
    public UserServiceDAOMySQL(LocalContainerEntityManagerFactoryBean entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public List<User> getAll() {
        entityManager.sa
        TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
        return query.getResultList();
    }

    @Transactional
    @Override
    public User getById(Long id) {
        return null;
    }

    @Transactional
    @Override
    public void add(User user) {
        //sessionFactory.getCurrentSession().save(user);
    }

    @Transactional
    @Override
    public void update(Long id, User user) {
        //sessionFactory.getCurrentSession().update(user);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        //sessionFactory.getCurrentSession().delete(getById(id));
    }
}
