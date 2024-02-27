/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.cmjd.layered.service.custom;

import hotel.cmjd.layered.dto.GuestDto;
import hotel.cmjd.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public interface GuestService extends SuperService{
     String addGuest(GuestDto dto) throws Exception;

    String updateGuest(GuestDto dto) throws Exception;

    String deleteGuest(String id) throws Exception;

    GuestDto getGuest(String id) throws Exception;

    List<GuestDto> getAll() throws Exception;
}
