/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.cmjd.layered.dao.custom;

import hotel.cmjd.layered.dao.CrudDao;
import hotel.cmjd.layered.entity.UserEntity;

/**
 *
 * @author kenulfernando
 */
public interface UserDao extends CrudDao<UserEntity, String>{
    
   String login(String username,String password)throws Exception;
}
