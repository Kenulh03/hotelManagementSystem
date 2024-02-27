/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.controller;

import hotel.cmjd.layered.dto.UserDto;
import hotel.cmjd.layered.entity.UserEntity;
import hotel.cmjd.layered.service.ServiceFactory;
import hotel.cmjd.layered.service.custom.UserService;

/**
 *
 * @author kenulfernando
 */
public class UserController {
    private UserService userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public String login(String username,String password)throws Exception{
        return userService.login(username, password);
    }

  
    
}
