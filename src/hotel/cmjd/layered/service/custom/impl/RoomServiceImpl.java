/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.service.custom.impl;

import hotel.cmjd.layered.dao.DaoFactory;
import hotel.cmjd.layered.dao.custom.RoomDao;
import hotel.cmjd.layered.dto.RoomDto;
import hotel.cmjd.layered.entity.RoomEntity;
import hotel.cmjd.layered.service.custom.RoomService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class RoomServiceImpl implements RoomService {

    private RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOM);
    

    @Override
    public String addRoom(RoomDto dto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(
                dto.getRoomNumber(),
                dto.getRoomType(),
                dto.getRoomPrice(),
                dto.getRoomStatus()
        );

        if (roomDao.add(roomEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateRoom(RoomDto dto) throws Exception {
        RoomEntity roomEntity = new RoomEntity(
                dto.getRoomNumber(),
                dto.getRoomType(),
                dto.getRoomPrice(),
                dto.getRoomStatus());

        if (roomDao.update(roomEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail Update";
        }
    }

    @Override
    public String deleteRoom(String id) throws Exception {
        if (roomDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public RoomDto getRoom(String id) throws Exception {
        RoomEntity entity = roomDao.get(id);
        if (entity != null) {
            return new RoomDto(entity.getRoomNumber(), entity.getRoomType(), entity.getRoomPrice(),entity.getRoomStatus());
        }
        return null;
    }

    @Override
    public List<RoomDto> getAll() throws Exception {
        List<RoomDto> roomDtos = new ArrayList<>();
        List<RoomEntity> roomEntities = roomDao.getAll();
        for (RoomEntity entity : roomEntities) {
            roomDtos.add(new RoomDto(entity.getRoomNumber(), entity.getRoomType() ,entity.getRoomPrice(), entity.getRoomStatus()));
        }
        return roomDtos;
    }

    @Override
    public String updateStatus(String id) throws Exception {
    if (roomDao.updateStatus(id)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }}

    @Override
    public String reUpdateStatus(String roomNo) throws Exception {
     if (roomDao.reUpdateStatus(roomNo)) {
            return "Successfully Re-Updated";
        } else {
            return "Fail";
        } }

}
