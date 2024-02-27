/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.service.custom.impl;

import hotel.cmjd.layered.dao.DaoFactory;
import hotel.cmjd.layered.dao.custom.PackageDao;
import hotel.cmjd.layered.dto.PackageDto;
import hotel.cmjd.layered.entity.PackageEntity;
import hotel.cmjd.layered.service.custom.PackageService;

/**
 *
 * @author kenulfernando
 */
public class PackageServiceImpl implements PackageService{
         private PackageDao packageDao = (PackageDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.PACKAGE);

    @Override
    public PackageDto getPackage(String id) throws Exception {
    PackageEntity entity = packageDao.get(id);
        if (entity != null) {
            return new PackageDto(entity.getPackId(),entity.getPackName(),entity.getPackPrice());
        }
        return null; }
}
