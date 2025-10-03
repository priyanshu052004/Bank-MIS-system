package model;
//CREATE TABLE Customer (id int Primary key, name varchar(20),address varchar(20) ,contact int, int sid ;
// REFRENCESS sid(sId));


public class HeadOfficeEntity {
    // head oofice id (pk)
    private int Hid;
    private String address;
    private int contact;
    private String HeadOfficeName;
    // state office id (fk)
    private int sid;

    public HeadOfficeEntity(int Hid,String address, int contact, String HeadOfficeName){
        this.Hid=Hid;
        this.HeadOfficeName =HeadOfficeName;
        this.address=address;
        this.contact=contact;


    }

    public HeadOfficeEntity() {

    }

    public int getHid() {
        return Hid;
    }
    public void setHid(int Hid) {
        this.Hid = Hid;
    }
    public String getaddress() {
        return address;
    }
    public void setaddress(String address) {
        this.address = address;
    }
    public int getcontact() {
        return contact;
    }
    public void setcontact(int contact) {
        this.contact = contact;
    }

    public String getHeadOfficeName() {
        return HeadOfficeName;
    }
    public void setHeadOfficeName(String HeadOfficeName) {
        this.HeadOfficeName = HeadOfficeName;
    }



    @Override
    public String toString() {
        return "HeadOfficeEntity{" +
                "id=" + Hid +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", HeadOfficeName='" + HeadOfficeName + '\'' +
                ", sid=" + sid +
                '}';
    }
}
