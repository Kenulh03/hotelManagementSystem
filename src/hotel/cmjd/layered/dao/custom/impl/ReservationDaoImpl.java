/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.dao.custom.impl;

import hotel.cmjd.layered.dao.CrudUtil;
import hotel.cmjd.layered.dao.custom.ReservationDao;
import hotel.cmjd.layered.entity.ReservationEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class ReservationDaoImpl implements ReservationDao {

    @Override
    public boolean add(ReservationEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Reservation (resvId,guestId,roomNumber,packId,roomPrice,packPrice,resvDate,checkInDate,checkOutDate) VALUES(?,?,?,?,?,?,?,?,? )",
                t.getResvId(),
                t.getGuestId(),
                t.getRoomNumber(),
                t.getPackId(),
                t.getRoomPrice(),
                t.getPackPrice(),
                t.getResvDate(),
                t.getCheckInDate(),
                t.getCheckOutDate());
    }

    @Override
    public boolean update(ReservationEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Reservation WHERE (CurDate()-resvDate)<=1 AND resvId=?", id);
    }

    @Override
    public ReservationEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Reservation WHERE resvId = ?", id);
        while (rst.next()) {
            return new ReservationEntity(
                    rst.getString("resvId"),
                    rst.getString("guestId"),
                    rst.getString("roomNumber"),
                    rst.getString("packId"),
                    rst.getDouble("roomPrice"),
                    rst.getDouble("packPrice"),
                    rst.getString("resvDate"),
                    rst.getString("checkInDate"),
                    rst.getString("checkOutDate"),
                    rst.getInt("noOfDays"),
                    rst.getInt("price")
            );

        }
        return null;
    }

    @Override
    public List<ReservationEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Reservation");
        List<ReservationEntity> reservationEntities = new ArrayList<>();

        while (rst.next()) {
            reservationEntities.add(new ReservationEntity(
                    rst.getString("resvId"),
                    rst.getString("guestId"),
                    rst.getString("roomNumber"),
                    rst.getString("packId"),
                    rst.getDouble("roomPrice"),
                    rst.getDouble("packPrice"),
                    rst.getString("resvDate"),
                    rst.getString("checkInDate"),
                    rst.getString("checkOutDate"),
                    rst.getInt("noOfDays"),
                    rst.getInt("price")));
        }

        return reservationEntities;
    }

}
