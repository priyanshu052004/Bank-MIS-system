package model;

public class Branch {
    private int id;          // ID (Primary Key)
    private String name;     // Branch Name
    private String ifsc;     // IFSC Code
    private String address;  // Branch Address
    private int hId;         // HId (Foreign Key)

    // Constructor
    public Branch(int id, String name, String ifsc, String address, int hId) {
        this.id = id;
        this.name = name;
        this.ifsc = ifsc;
        this.address = address;
        this.hId = hId;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIfsc() { return ifsc; }
    public void setIfsc(String ifsc) { this.ifsc = ifsc; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getHId() { return hId; }
    public void setHId(int hId) { this.hId = hId; }

    // toString method
    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ifsc='" + ifsc + '\'' +
                ", address='" + address + '\'' +
                ", hId=" + hId +
                '}';
    }
}
