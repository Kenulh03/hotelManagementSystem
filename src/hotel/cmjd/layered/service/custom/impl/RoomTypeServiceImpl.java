/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.service.custom.impl;

import hotel.cmjd.layered.dao.DaoFactory;
import hotel.cmjd.layered.dao.custom.RoomTypeDao;
import hotel.cmjd.layered.dto.RoomTypeDto;
import hotel.cmjd.layered.entity.RoomTypeEntity;
import hotel.cmjd.layered.service.custom.RoomTypeService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class RoomTypeServiceImpl implements RoomTypeService {
     private RoomTypeDao roomTypeDao = (RoomTypeDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOM_TYPE);

    @Override
    public String addRoomType(RoomTypeDto dto) throws Exception {
    RoomTypeEntity roomTypeEntity = new RoomTypeEntity(
                dto.getRoomTypeId(),
                dto.getRoomType(),
                dto.getRoomTypePrice());

        if (roomTypeDao.add(roomTypeEntity)){
            return "Successfully Saved";
        } else {
            return "Fail";
        } }

    @Override
    public String updateRoomType(RoomTypeDto dto) throws Exception {
       RoomTypeEntity roomTypeEntity = new RoomTypeEntity(
                dto.getRoomTypeId(),
                dto.getRoomType(),
                dto.getRoomTypePrice());

        if (roomTypeDao.update(roomTypeEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }}

    @Override
    public String deleteRoomType(String id) throws Exception {
     if (roomTypeDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }  }

    @Override
    public RoomTypeDto getRoomType(String id) throws Exception {
   RoomTypeEntity entity = roomTypeDao.get(id);
        if (entity != null) {
            return new RoomTypeDto(entity.getRoomTypeId(),entity.getRoomType(),entity.getRoomTypePrice());
        }
        return null; }

    @Override
    public List<RoomTypeDto> getAll() throws Exception {
         List<RoomTypeDto> roomTypeDtos = new ArrayList<>();
        List<RoomTypeEntity> customerEntities = roomTypeDao.getAll();
        for (RoomTypeEntity entity : customerEntities) {
            roomTypeDtos.add(new RoomTypeDto(entity.getRoomTypeId(),entity.getRoomType(),entity.getRoomTypePrice()));
        }
        return roomTypeDtos;  }
    
}
