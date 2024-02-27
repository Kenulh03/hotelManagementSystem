/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.dao.custom.impl;

import hotel.cmjd.layered.dao.CrudUtil;
import hotel.cmjd.layered.dao.custom.UserDao;
import hotel.cmjd.layered.entity.UserEntity;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class UserDaoImpl implements UserDao {

    @Override
    public boolean add(UserEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(UserEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<UserEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String login(String username, String password) throws Exception {
    ResultSet rst = CrudUtil
        .executeQuery("SELECT * FROM User WHERE userName=? AND password=?", username, password);
    
        System.out.println(rst);
    if (!rst.next()) {
      return null;
    } else {
      return rst.getString(1);
    }

  }
}
