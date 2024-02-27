/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.service.custom.impl;

import hotel.cmjd.layered.dao.DaoFactory;
import hotel.cmjd.layered.dao.custom.UserDao;
import hotel.cmjd.layered.dto.UserDto;
import hotel.cmjd.layered.entity.UserEntity;
import hotel.cmjd.layered.service.custom.UserService;

/**
 *
 * @author kenulfernando
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public String login(String username, String password) throws Exception {
        return userDao.login(username, password);
    }

}
