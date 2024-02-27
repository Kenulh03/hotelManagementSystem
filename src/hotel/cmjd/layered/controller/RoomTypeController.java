/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.controller;

import hotel.cmjd.layered.dto.RoomTypeDto;
import hotel.cmjd.layered.service.ServiceFactory;
import hotel.cmjd.layered.service.custom.RoomTypeService;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class RoomTypeController {
    private RoomTypeService roomTypeService = (RoomTypeService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM_TYPE);

    public String saveRoomType(RoomTypeDto roomTypeDto) throws Exception{
        return roomTypeService.addRoomType(roomTypeDto);
    }
    
    public String updateRoomType(RoomTypeDto roomTypeDto) throws Exception{
        return roomTypeService.updateRoomType(roomTypeDto);
    }
    
    public String deleteRoomType(String id) throws Exception{
        return roomTypeService.deleteRoomType(id);
    }
    
    public RoomTypeDto getRoomType(String id) throws Exception{
        return roomTypeService.getRoomType(id);
    }
    
    public List<RoomTypeDto> getAllRoomType() throws Exception{
        return roomTypeService.getAll();
    }
}
