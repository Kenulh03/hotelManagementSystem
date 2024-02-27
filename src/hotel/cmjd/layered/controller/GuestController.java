/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.controller;

import hotel.cmjd.layered.dto.GuestDto;
import hotel.cmjd.layered.service.ServiceFactory;
import hotel.cmjd.layered.service.custom.GuestService;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class GuestController {
     private GuestService guestService = (GuestService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.GUEST);

    public String saveGuest(GuestDto guestDto) throws Exception{
        return guestService.addGuest(guestDto);
    }
    
    public String updateGuest(GuestDto guestDto) throws Exception{
        return guestService.updateGuest(guestDto);
    }
    
    public String deleteGuest(String id) throws Exception{
        return guestService.deleteGuest(id);
    }
    
    public GuestDto getGuest(String id) throws Exception{
        return guestService.getGuest(id);
    }
    
    public List<GuestDto> getAllGuest() throws Exception{
        return guestService.getAll();
    }
}
