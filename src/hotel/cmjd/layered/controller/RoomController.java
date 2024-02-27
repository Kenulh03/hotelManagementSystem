/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.controller;

import hotel.cmjd.layered.dto.RoomDto;
import hotel.cmjd.layered.service.ServiceFactory;
import hotel.cmjd.layered.service.custom.RoomService;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class RoomController {
    private RoomService roomService = (RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);

       public String saveRoom(RoomDto roomDto) throws Exception{
        return roomService.addRoom(roomDto);
    }
    
    public String updateRoom(RoomDto roomDto) throws Exception{
        return roomService.updateRoom(roomDto);
    }
    
    public String deleteRoom(String id) throws Exception{
        return roomService.deleteRoom(id);
    }
    
    public RoomDto getRoom(String id) throws Exception{
        return roomService.getRoom(id);
    }
    
    public List<RoomDto> getAllRoom() throws Exception{
        return roomService.getAll();
    }
    
    public String reUpdateStatus(String roomNo) throws Exception{
        return roomService.reUpdateStatus(roomNo);
    }
}
