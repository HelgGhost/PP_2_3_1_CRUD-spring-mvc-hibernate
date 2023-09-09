package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserServiceDAOMySQL implements UserServiceDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public List<User> getAll() {
        return entityManager.createQuery("select u from User as u").getResultList();
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
