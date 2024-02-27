/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.controller;

import hotel.cmjd.layered.dto.PackageDto;
import hotel.cmjd.layered.service.ServiceFactory;
import hotel.cmjd.layered.service.custom.PackageService;

/**
 *
 * @author kenulfernando
 */
public class PackageController {
    private PackageService packageService = (PackageService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.PACKAGE);

    public PackageDto getPackage(String id) throws Exception{
        return packageService.getPackage(id);
    }
}
