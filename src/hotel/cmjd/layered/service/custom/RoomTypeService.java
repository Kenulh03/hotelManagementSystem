/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.cmjd.layered.service.custom;

import hotel.cmjd.layered.dto.RoomTypeDto;
import hotel.cmjd.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public interface RoomTypeService extends SuperService {
    String addRoomType(RoomTypeDto dto) throws Exception;

    String updateRoomType(RoomTypeDto dto) throws Exception;

    String deleteRoomType(String id) throws Exception;

    RoomTypeDto getRoomType(String id) throws Exception;

    List<RoomTypeDto> getAll() throws Exception;
}
