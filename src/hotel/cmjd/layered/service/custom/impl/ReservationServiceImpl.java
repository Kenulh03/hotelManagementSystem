/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.service.custom.impl;

import hotel.cmjd.layered.dao.DaoFactory;
import hotel.cmjd.layered.dao.custom.ReservationDao;
import hotel.cmjd.layered.dao.custom.RoomDao;
import hotel.cmjd.layered.db.DBConnection;
import hotel.cmjd.layered.dto.ReservationDto;
import hotel.cmjd.layered.entity.ReservationEntity;
import hotel.cmjd.layered.entity.RoomEntity;
import hotel.cmjd.layered.service.custom.ReservationService;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class ReservationServiceImpl implements ReservationService {

    private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOM);
    private ReservationDao reservationDao = (ReservationDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RESERVATION);

    @Override
    public String placeReservation(ReservationDto dto) throws Exception {

        Connection connection = DBConnection.getInstance().getCOnnection();
        try {
            connection.setAutoCommit(false);

            ReservationEntity reservationEntity = new ReservationEntity(
                    dto.getResvId(),
                    dto.getGuestId(),
                    dto.getRoomNumber(),
                    dto.getPackId(),
                    dto.getRoomPrice(),
                    dto.getPackPrice(),
                    dto.getResvDate(),
                    dto.getCheckInDate(),
                    dto.getCheckOutDate(),
                    dto.getNoOfDays(),
                    dto.getPrice());

            if (reservationDao.add(reservationEntity)) {

                String id = reservationEntity.getRoomNumber();
                if (roomDao.updateStatus(id)) {
                    connection.commit();
                    return "Success";
                } else {
                    connection.rollback();
                    return "Room Status Update Error";
                }
            } else {
                connection.rollback();
                return "Place Reservation Error";
            }

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public String deleteReservation(String id, String roomNo) throws Exception {
        Connection connection = DBConnection.getInstance().getCOnnection();
       
        try {
            connection.setAutoCommit(false);

            if (reservationDao.delete(id)) {

                if (roomDao.reUpdateStatus(roomNo)) {
                    connection.commit();
                    return "Success";

                } else {
                    connection.rollback();
                    return "Room Status Re-Update Error";
                }

            } else {

                connection.rollback();
                return "Delete Reservation Error";
            }

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }

    }

    @Override
    public ReservationDto getReservation(String id) throws Exception {
        ReservationEntity entity = reservationDao.get(id);
        if (entity != null) {
            return new ReservationDto(entity.getResvId(), entity.getGuestId(), entity.getRoomNumber(), entity.getPackId(),
                    entity.getRoomPrice(), entity.getPackPrice(), entity.getResvDate(), entity.getCheckInDate(), entity.getCheckOutDate(),
                    entity.getNoOfDays(), entity.getPrice());
        }
        return null;
    }

    @Override
    public List<ReservationDto> getAll() throws Exception {
        List<ReservationDto> reservationDtos = new ArrayList<>();
        List<ReservationEntity> reservationEntities = reservationDao.getAll();
        for (ReservationEntity entity : reservationEntities) {
            reservationDtos.add(new ReservationDto(entity.getResvId(), entity.getGuestId(), entity.getRoomNumber(), entity.getPackId(),
                    entity.getRoomPrice(), entity.getPackPrice(), entity.getResvDate(), entity.getCheckInDate(), entity.getCheckOutDate(),
                    entity.getNoOfDays(), entity.getPrice()));
        }
        return reservationDtos;
    }
}


