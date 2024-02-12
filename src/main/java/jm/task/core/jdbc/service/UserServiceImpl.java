package jm.task.core.jdbc.service;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
   //private UserDao userDaoJDBCVersion = new UserDaoJDBCImpl();
   private UserDao userDaoHibernateVersion = new UserDaoHibernateImpl();
    


    public void createUsersTable() {
        userDaoHibernateVersion.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoHibernateVersion.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernateVersion.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoHibernateVersion.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoHibernateVersion.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoHibernateVersion.cleanUsersTable();
    }
}
