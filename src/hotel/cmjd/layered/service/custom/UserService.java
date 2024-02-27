/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.cmjd.layered.service.custom;

import hotel.cmjd.layered.dto.UserDto;
import hotel.cmjd.layered.entity.UserEntity;
import hotel.cmjd.layered.service.SuperService;

/**
 *
 * @author kenulfernando
 */
public interface UserService extends SuperService{
    
 String login(String username,String password) throws Exception;

}
