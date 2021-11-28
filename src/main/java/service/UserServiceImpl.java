package service;

import bean.User;
import dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;

    public User selectUser(long Id) {

        return this.userDao.selectUser(Id);
    }
}
