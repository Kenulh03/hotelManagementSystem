/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.dao.custom.impl;

import hotel.cmjd.layered.dao.CrudUtil;
import hotel.cmjd.layered.dao.custom.PackageDao;
import hotel.cmjd.layered.entity.PackageEntity;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author kenulfernando
 */
public class PackageDaoImpl implements PackageDao{

    @Override
    public boolean add(PackageEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(PackageEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PackageEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Package WHERE packId = ?", id);
        while (rst.next()) {
            return new PackageEntity(
                    rst.getString("PackId"),
                    rst.getString("PackName"),
                    rst.getDouble("packPrice"));
       }
           return null;  }

    @Override
    public List<PackageEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
