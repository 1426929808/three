package com.complect;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

//    public UserServiceImpl(){
//
//    }
//    public UserServiceImpl(UserDaoImpl Dao) {
//
//        this.userDao = Dao;
//    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void update() {
        userDao.update();
    }
}
