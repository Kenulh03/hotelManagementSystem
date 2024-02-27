/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.cmjd.layered.service.custom;

import hotel.cmjd.layered.dto.RoomDto;
import hotel.cmjd.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public interface RoomService extends SuperService {

    String addRoom(RoomDto dto) throws Exception;

    String updateRoom(RoomDto dto) throws Exception;

    String deleteRoom(String id) throws Exception;

    RoomDto getRoom(String id) throws Exception;

    List<RoomDto> getAll() throws Exception;

    String updateStatus(String id) throws Exception;

    String reUpdateStatus(String roomNo) throws Exception;

}
