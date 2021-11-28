package service;

import bean.User;

public interface UserService {
    public User selectUser(long userId);
}