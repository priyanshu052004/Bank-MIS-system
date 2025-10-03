package model;

// CREATE TABLE Revenue ( id int, amount float , source varchar(20), type varchar(20) ;
// Bid int , FOREIGN KEY (Bid) REFERENCES Branch(Id) );

public class Revenue {
    private int id;
    private int Bid;  // Bid - Foreign Key
    private float amount;
    private String source;
    private String type;

    // Constructor
    public Revenue(int id, int Bid, float amount, String source, String type)
    {
        this.id = id;
        this.Bid = Bid;
        this.amount = amount;
        this.source = source;
        this.type = type;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id= id;
    }

    public int getBid() {
        return Bid;
    }
    public void setBid(int Bid) {
        Bid = Bid;
    }

    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    // toString method
    @Override
    public String toString() {
        return "Revenue [ID= " + id + ", Bid= " + Bid +
                ", Amount= " + amount + ", Source= " + source +
                ", Type= " + type + "]";
    }
}
