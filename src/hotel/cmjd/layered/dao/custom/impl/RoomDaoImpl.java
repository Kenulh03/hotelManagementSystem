/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.dao.custom.impl;

import hotel.cmjd.layered.dao.CrudUtil;
import hotel.cmjd.layered.dao.custom.RoomDao;
import hotel.cmjd.layered.entity.RoomEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class RoomDaoImpl implements RoomDao {

    @Override
    public boolean add(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Room VALUES (?,?,?,?)",
                t.getRoomNumber(),
                t.getRoomType(),
                t.getRoomPrice(),
                t.getRoomStatus());
    }

    @Override
    public boolean update(RoomEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Room  SET typeId=?,roomPrice=?,roomStatus=? WHERE roomNumber=? ",
                t.getRoomType(),
                t.getRoomPrice(),
                t.getRoomStatus(),
                t.getRoomNumber());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Room WHERE roomNumber=?", id);
    }

    @Override
    public RoomEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Room WHERE roomNumber = ?", id);
        while (rst.next()) {
            return new RoomEntity(
                    rst.getString("roomNumber"),
                    rst.getString("typeId"),
                    rst.getDouble("roomPrice"),
                    rst.getString("roomStatus"));
        }
        return null;
    }

    @Override
    public List<RoomEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Room");
        List<RoomEntity> roomEntities = new ArrayList<>();

        while (rst.next()) {
            roomEntities.add(new RoomEntity(
                    rst.getString("roomNumber"),
                    rst.getString("typeId"),
                    rst.getDouble("roomPrice"),
                    rst.getString("roomStatus")));
        }

        return roomEntities;
    }

    @Override
    public boolean updateStatus(String id) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Room  SET roomStatus='Reserved' WHERE roomNumber=? ",id);
    }

    @Override
    public boolean reUpdateStatus(String roomNo) throws Exception {
         return CrudUtil.executeUpdate("UPDATE Room  SET roomStatus='Not-Reserved' WHERE roomNumber=? ",roomNo);
   }
}
