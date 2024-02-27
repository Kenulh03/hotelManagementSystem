/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.controller;


import hotel.cmjd.layered.dto.ReservationDto;
import hotel.cmjd.layered.service.ServiceFactory;
import hotel.cmjd.layered.service.custom.ReservationService;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class ReservationController {
    private ReservationService reservationService = (ReservationService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESERVATION);

    public String placeReservation(ReservationDto dto) throws Exception {
        return reservationService.placeReservation(dto);
    }
    
    
    public String deleteReservation(String id,String roomNo) throws Exception {
        return reservationService.deleteReservation(id, roomNo);
    }
    
    
    public ReservationDto getReservation(String id) throws Exception{
        return reservationService.getReservation(id);
    }
    
    public List<ReservationDto> getAllReservation() throws Exception{
        return reservationService.getAll();
    }
    
}
