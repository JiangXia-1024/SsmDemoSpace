package dao;

import bean.User;

public interface UserDao {

    User selectUser(long id);
}
