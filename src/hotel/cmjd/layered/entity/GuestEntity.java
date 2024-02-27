/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.cmjd.layered.entity;

/**
 *
 * @author kenulfernando
 */
public class GuestEntity {

    private String guestId;
    private String guestFirstName;
    private String guestLastName;
    private String guestAddress;
    private String passportNumber;
    private String guestCountry;
    private String guestContact;

    @Override
    public String toString() {
        return "GuestEntity{" + "guestId=" + guestId + ", guestFirstName=" + guestFirstName + ", guestLastName=" + guestLastName + ", guestAddress=" + guestAddress + ", passportNumber=" + passportNumber + ", guestCountry=" + guestCountry + ", guestContact=" + guestContact + ", guestStatus=" + '}';
    }

    public GuestEntity(String guestId, String guestFirstName, String guestLastName, String guestAddress, String passportNumber, String guestCountry, String guestContact) {
        this.guestId = guestId;
        this.guestFirstName = guestFirstName;
        this.guestLastName = guestLastName;
        this.guestAddress = guestAddress;
        this.passportNumber = passportNumber;
        this.guestCountry = guestCountry;
        this.guestContact = guestContact;
    }

    public GuestEntity() {
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
     * @return the guestFirstName
     */
    public String getGuestFirstName() {
        return guestFirstName;
    }

    /**
     * @param guestFirstName the guestFirstName to set
     */
    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    /**
     * @return the guestLastName
     */
    public String getGuestLastName() {
        return guestLastName;
    }

    /**
     * @param guestLastName the guestLastName to set
     */
    public void setGuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }

    /**
     * @return the guestAddress
     */
    public String getGuestAddress() {
        return guestAddress;
    }

    /**
     * @param guestAddress the guestAddress to set
     */
    public void setGuestAddress(String guestAddress) {
        this.guestAddress = guestAddress;
    }

    /**
     * @return the passportNumber
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * @param passportNumber the passportNumber to set
     */
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    /**
     * @return the guestCountry
     */
    public String getGuestCountry() {
        return guestCountry;
    }

    /**
     * @param guestCountry the guestCountry to set
     */
    public void setGuestCountry(String guestCountry) {
        this.guestCountry = guestCountry;
    }

    /**
     * @return the guestContact
     */
    public String getGuestContact() {
        return guestContact;
    }

    /**
     * @param guestContact the guestContact to set
     */
    public void setGuestContact(String guestContact) {
        this.guestContact = guestContact;
    }
}
