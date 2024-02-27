/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.dao.custom.impl;

import hotel.cmjd.layered.dao.CrudUtil;
import hotel.cmjd.layered.dao.custom.GuestDao;
import hotel.cmjd.layered.entity.GuestEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class GuestDaoImpl implements GuestDao {

    @Override
    public boolean add(GuestEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Guest VALUES (?,?,?,?,?,?,?)",
                t.getGuestId(),
                t.getGuestFirstName(),
                t.getGuestLastName(),
                t.getGuestAddress(),
                t.getGuestCountry(),
                t.getPassportNumber(),
                t.getGuestContact());
    }

    @Override
    public boolean update(GuestEntity t) throws Exception {
  return CrudUtil.executeUpdate("UPDATE Guest SET guestFirstName=?, guestLastName=?, "
                + "guestAddress=?, passportNumber=?, guestCountry=?, guestContact=?  "
                + "WHERE guestId=?",
                t.getGuestFirstName(),
                t.getGuestLastName(),
                t.getGuestAddress(),
                t.getPassportNumber(),
                t.getGuestCountry(),
                t.getGuestContact(),
                t.getGuestId());  }

    @Override
    public boolean delete(String id) throws Exception {
         return CrudUtil.executeUpdate("DELETE FROM Guest WHERE guestId=?", id);
    }

    @Override
    public GuestEntity get(String id) throws Exception {
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Guest WHERE guestId = ?", id);
        while (rst.next()) {
            return new GuestEntity(
                    rst.getString("guestId"),
                    rst.getString("guestFirstName"),
                    rst.getString("guestLastName"),
                    rst.getString("guestAddress"),
                    rst.getString("passportNumber"),
                    rst.getString("guestCountry"),
                    rst.getString("guestContact"));
        }

        return null; }

    @Override
    public List<GuestEntity> getAll() throws Exception {
     ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Guest");
        List<GuestEntity> guestEntities = new ArrayList<>();

        while (rst.next()) {
            guestEntities.add(new GuestEntity(
                    rst.getString("guestID"),
                    rst.getString("guestFirstName"),
                    rst.getString("guestLastName"),
                    rst.getString("guestAddress"),
                    rst.getString("guestCountry"),
                    rst.getString("passportNumber"),
                    rst.getString("guestContact")));
        }

        return guestEntities;}

}
