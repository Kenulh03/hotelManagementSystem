/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.service;

import hotel.cmjd.layered.service.custom.impl.GuestServiceImpl;
import hotel.cmjd.layered.service.custom.impl.PackageServiceImpl;
import hotel.cmjd.layered.service.custom.impl.ReservationServiceImpl;
import hotel.cmjd.layered.service.custom.impl.RoomServiceImpl;
import hotel.cmjd.layered.service.custom.impl.RoomTypeServiceImpl;
import hotel.cmjd.layered.service.custom.impl.UserServiceImpl;

/**
 *
 * @author kenulfernando
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }

        return serviceFactory;
    }

    public SuperService getService(ServiceType serviceType) {

        switch (serviceType) {
            case GUEST:
                return new GuestServiceImpl();
            case ROOM_TYPE:
                return new RoomTypeServiceImpl();
            case ROOM:
                return new RoomServiceImpl();
            case PACKAGE:
                return new PackageServiceImpl();
            case RESERVATION:
                return new ReservationServiceImpl();
            case USER:
                return new UserServiceImpl();
            default:
                return null;
        }

    }

    public enum ServiceType {
        USER, GUEST, RESERVATION, ROOM_TYPE, ROOM, PACKAGE
    }
}
