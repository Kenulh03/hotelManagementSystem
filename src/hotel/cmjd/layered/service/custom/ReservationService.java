/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.cmjd.layered.service.custom;

import hotel.cmjd.layered.dto.ReservationDto;
import hotel.cmjd.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public interface ReservationService extends SuperService {

    String placeReservation(ReservationDto dto) throws Exception;

    String deleteReservation(String id,String roomNo) throws Exception;

    ReservationDto getReservation(String id) throws Exception;

    List<ReservationDto> getAll() throws Exception;
}
