/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.service.custom.impl;

import hotel.cmjd.layered.dao.DaoFactory;
import hotel.cmjd.layered.dao.custom.GuestDao;
import hotel.cmjd.layered.dto.GuestDto;
import hotel.cmjd.layered.entity.GuestEntity;
import hotel.cmjd.layered.service.custom.GuestService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class GuestServiceImpl implements GuestService {

    private GuestDao guestDao = (GuestDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.GUEST);

    @Override
    public String addGuest(GuestDto dto) throws Exception {
        GuestEntity guestEntity = new GuestEntity(
                dto.getGuestId(), dto.getGuestFirstName(),
                dto.getGuestLastName(), dto.getGuestAddress(),
                dto.getGuestCountry(), dto.getPassportNumber(),
                dto.getGuestContact());

        if (guestDao.add(guestEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateGuest(GuestDto dto) throws Exception {
        GuestEntity guestEntity = new GuestEntity(
                dto.getGuestId(), dto.getGuestFirstName(),
                dto.getGuestLastName(), dto.getGuestAddress(),
                dto.getGuestCountry(), dto.getPassportNumber(),
                dto.getGuestContact());

        if (guestDao.update(guestEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteGuest(String id) throws Exception {
        if (guestDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public GuestDto getGuest(String id) throws Exception {
        GuestEntity entity = guestDao.get(id);
        if (entity != null) {
            return new GuestDto(entity.getGuestId(),
                    entity.getGuestFirstName(), entity.getGuestLastName(), entity.getGuestAddress(),
                    entity.getGuestCountry(), entity.getPassportNumber(),
                    entity.getGuestContact());
        }
        return null;
    }

    @Override
    public List<GuestDto> getAll() throws Exception {
        List<GuestDto> guestDtos = new ArrayList<>();
        List<GuestEntity> customerEntities = guestDao.getAll();
        for (GuestEntity entity : customerEntities) {
            guestDtos.add(new GuestDto(entity.getGuestId(),
                    entity.getGuestFirstName(), entity.getGuestLastName(), entity.getGuestAddress(),
                    entity.getGuestCountry(), entity.getPassportNumber(),
                    entity.getGuestContact()));
        }
        return guestDtos;
    }
}


