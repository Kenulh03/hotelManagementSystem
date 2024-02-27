/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.entity;

/**
 *
 * @author kenulfernando
 */
public class ReservationEntity {

    private String resvId;
    private String guestId;
    private String roomNumber;
    private String packId;
    private Double roomPrice;
    private Double packPrice;
    private String resvDate;
    private String checkInDate;
    private String checkOutDate;
    private Integer noOfDays;
    private Integer price;

    public ReservationEntity() {
    }

    public ReservationEntity(String resvId, String guestId, String roomNumber, String packId, Double roomPrice, Double packPrice, String resvDate, String checkInDate, String checkOutDate, Integer noOfDays, Integer price) {
        this.resvId = resvId;
        this.guestId = guestId;
        this.roomNumber = roomNumber;
        this.packId = packId;
        this.roomPrice = roomPrice;
        this.packPrice = packPrice;
        this.resvDate = resvDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.noOfDays = noOfDays;
        this.price = price;
    }

    /**
     * @return the resvId
     */
    public String getResvId() {
        return resvId;
    }

    /**
     * @param resvId the resvId to set
     */
    public void setResvId(String resvId) {
        this.resvId = resvId;
    }

    /**
     * @return the guestId
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * @param guestId the guestId to set
     */
    public void setGuestId(String guestId) {
        this.guestId = guestId;
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

    /**
     * @return the resvDate
     */
    public String getResvDate() {
        return resvDate;
    }

    /**
     * @param resvDate the resvDate to set
     */
    public void setResvDate(String resvDate) {
        this.resvDate = resvDate;
    }

    /**
     * @return the checkInDate
     */
    public String getCheckInDate() {
        return checkInDate;
    }

    /**
     * @param checkInDate the checkInDate to set
     */
    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    /**
     * @return the checkOutDate
     */
    public String getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * @param checkOutDate the checkOutDate to set
     */
    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    /**
     * @return the noOfDays
     */
    public Integer getNoOfDays() {
        return noOfDays;
    }

    /**
     * @param noOfDays the noOfDays to set
     */
    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }

    /**
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ReservationEntity{" + "resvId=" + resvId + ", guestId=" + guestId + ", roomNumber=" + roomNumber + ", packId=" + packId + ", roomPrice=" + roomPrice + ", packPrice=" + packPrice + ", resvDate=" + resvDate + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", noOfDays=" + noOfDays + ", price=" + price + '}';
    }
    
    
    
    
}
