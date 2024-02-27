/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotel.cmjd.layered.dao.custom;

import hotel.cmjd.layered.dao.CrudDao;

import hotel.cmjd.layered.entity.RoomEntity;

/**
 *
 * @author kenulfernando
 */
public interface RoomDao extends CrudDao<RoomEntity, String>{

    boolean updateStatus(String id) throws Exception;
    
    boolean reUpdateStatus(String roomNo) throws Exception;
    
    
}
