/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.dto;

/**
 *
 * @author kenulfernando
 */
public class RoomDto {

    private String roomNumber;
    private String roomType;
    private Double roomPrice;
    private String roomStatus;

    public RoomDto() {
    }

    public RoomDto(String roomNumber, String roomType, Double roomPrice, String roomStatus) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomStatus = roomStatus;
    }

    /**
     * @return the roomNumber
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
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
     * @return the roomPrice
     */
    public Double getRoomPrice() {
        return roomPrice;
    }

    /**
     * @param roomPrice the roomPrice to set
     */
    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    /**
     * @return the roomStatus
     */
    public String getRoomStatus() {
        return roomStatus;
    }

    /**
     * @param roomStatus the roomStatus to set
     */
    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    @Override
    public String toString() {
        return "RoomDto{" + "roomNumber=" + roomNumber + ", roomType=" + roomType + ", roomPrice=" + roomPrice + ", roomStatus=" + roomStatus + '}';
    }


    
}
