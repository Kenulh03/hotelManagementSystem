/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.entity;

/**
 *
 * @author kenulfernando
 */
public class PackageEntity {

    private String packId;
    private String packName;
    private Double packPrice;

    public PackageEntity() {
    }

    public PackageEntity(String packId, String packName, Double packPrice) {
        this.packId = packId;
        this.packName = packName;
        this.packPrice = packPrice;
    }

    /**
     * @return the packId
     */
    public String getPackId() {
        return packId;
    }

    /**
     * @param packId the packId to set
     */
    public void setPackId(String packId) {
        this.packId = packId;
    }

    /**
     * @return the packName
     */
    public String getPackName() {
        return packName;
    }

    /**
     * @param packName the packName to set
     */
    public void setPackName(String packName) {
        this.packName = packName;
    }

    /**
     * @return the packPrice
     */
    public Double getPackPrice() {
        return packPrice;
    }

    /**
     * @param packPrice the packPrice to set
     */
    public void setPackPrice(Double packPrice) {
        this.packPrice = packPrice;
    }

    @Override
    public String toString() {
        return "PackageEntity{" + "packId=" + packId + ", packName=" + packName + ", packPrice=" + packPrice + '}';
    }
    
    
}
