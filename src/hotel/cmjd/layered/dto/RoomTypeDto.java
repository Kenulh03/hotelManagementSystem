/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.dto;

/**
 *
 * @author kenulfernando
 */
public class RoomTypeDto {

    private String roomTypeId;
    private String roomType;
    private Double roomTypePrice;

    public RoomTypeDto() {
    }

    public RoomTypeDto(String roomTypeId, String roomType, Double roomTypePrice) {
        this.roomTypeId = roomTypeId;
        this.roomType = roomType;
        this.roomTypePrice = roomTypePrice;
    }

    /**
     * @return the roomTypeId
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * @param roomTypeId the roomTypeId to set
     */
    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    /**
     * @return the roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * @param roomType the roomType to set
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * @return the roomTypePrice
     */
    public Double getRoomTypePrice() {
        return roomTypePrice;
    }

    /**
     * @param roomTypePrice the roomTypePrice to set
     */
    public void setRoomTypePrice(Double roomTypePrice) {
        this.roomTypePrice = roomTypePrice;
    }

    @Override
    public String toString() {
        return "RoomTypeDto{" + "roomTypeId=" + roomTypeId + ", roomType=" + roomType + ", roomTypePrice=" + roomTypePrice + '}';
    }

}
