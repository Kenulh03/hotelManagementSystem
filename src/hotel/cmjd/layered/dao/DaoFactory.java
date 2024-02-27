/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.dao;

import hotel.cmjd.layered.dao.custom.impl.GuestDaoImpl;
import hotel.cmjd.layered.dao.custom.impl.PackageDaoImpl;
import hotel.cmjd.layered.dao.custom.impl.ReservationDaoImpl;
import hotel.cmjd.layered.dao.custom.impl.RoomDaoImpl;
import hotel.cmjd.layered.dao.custom.impl.RoomTypeDaoImpl;
import hotel.cmjd.layered.dao.custom.impl.UserDaoImpl;

/**
 *
 * @author kenulfernando
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case GUEST:
                return new GuestDaoImpl();
            case ROOM_TYPE:
                return new RoomTypeDaoImpl();
            case ROOM:
                return new RoomDaoImpl();
            case PACKAGE:
                return new PackageDaoImpl();
            case RESERVATION:
                return new ReservationDaoImpl();
            case USER:
                return new UserDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        GUEST, RESERVATION, ROOM, ROOM_TYPE, USER, PACKAGE
    }
}
