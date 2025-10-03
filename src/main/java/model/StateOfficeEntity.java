
package model;

// SQL Query:
// CREATE TABLE StateOfficeEntity (sid INT PRIMARY KEY, stateOfficeName VARCHAR(255),address VARCHAR(255),pincode VARCHAR(20),city VARCHAR(100));

public class StateOfficeEntity {
    private String stateOfficeName;
    private String address;
    private String pincode;
    private String city;
    private int sId;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public StateOfficeEntity(String stateOfficeName, String address, String pincode, String city) {

        this.stateOfficeName = stateOfficeName;
        this.address = address;
        this.pincode = pincode;
        this.city = city;
    }

    public StateOfficeEntity() {

    }


    public String getStateOfficeName() {
        return stateOfficeName;
    }

    public void setStateOfficeName(String stateOfficeName) {
        this.stateOfficeName = stateOfficeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "StateOfficeEntity{" +
                ", stateOfficeName='" + stateOfficeName + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
