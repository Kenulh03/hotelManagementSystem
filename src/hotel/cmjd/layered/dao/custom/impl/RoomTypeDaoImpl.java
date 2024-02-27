/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.dao.custom.impl;

import hotel.cmjd.layered.dao.CrudUtil;
import hotel.cmjd.layered.dao.custom.RoomTypeDao;
import hotel.cmjd.layered.entity.RoomTypeEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class RoomTypeDaoImpl implements RoomTypeDao{

    @Override
    public boolean add(RoomTypeEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO RoomType VALUES (?,?,?)",
                t.getRoomTypeId(),
                t.getRoomType(),
                t.getRoomTypePrice());
    }

    @Override
    public boolean update(RoomTypeEntity t) throws Exception {
   return CrudUtil.executeUpdate("UPDATE RoomType  SET typeName=?, typePrice=? WHERE typeId=? ",
                t.getRoomType(),
                t.getRoomTypePrice(),
                t.getRoomTypeId());  
    }

    @Override
    public boolean delete(String id) throws Exception {
           return CrudUtil.executeUpdate("DELETE FROM RoomType WHERE typeId=?", id);
  }

    @Override
    public RoomTypeEntity get(String id) throws Exception {
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM RoomType WHERE typeId = ?", id);
        while (rst.next()) {
            return new RoomTypeEntity(
                    rst.getString("typeId"),
                    rst.getString("typeName"),
                    rst.getDouble("typePrice"));
        }

        return null;  }

    @Override
    public List<RoomTypeEntity> getAll() throws Exception {
   ResultSet rst = CrudUtil.executeQuery("SELECT * FROM RoomType");
        List<RoomTypeEntity> roomTypeEntities = new ArrayList<>();

        while (rst.next()) {
            roomTypeEntities.add(new RoomTypeEntity(
                    rst.getString("typeId"),
                    rst.getString("typeName"),
                    rst.getDouble("typePrice")));
        }

        return roomTypeEntities; }
    
}
