package model;
//CREATE TABLE Customer (Cid int Primary key, Cname varchar(20),address varchar(20),address varchar(20), balanace int ;
//accountnumer int, contact int, bid int , FOREIGN KEY (bid)    REFRENCESS Branch(Id));

public class CustomerEntity {
//    customer id pk
    private int Cid;
    private String Cname;
    private String address;
    private int balance;
    private int accountnumber;
    private int contact;
//    branch id fk
    private int bid;
    public CustomerEntity( String Cname, String address, int balance, int accountnumber, int contact, int bid) {
        this.Cname = Cname;
        this.address = address;
        this.balance = balance;
        this.accountnumber = accountnumber;
        this.contact = contact;
        this.bid = bid;

    }

    public CustomerEntity() {

    }


    public int getCid() {
        return Cid;
    }
    public void setCid(int Cid) {
        this.Cid = Cid;
    }
    public String getCname() {
        return Cname;
    }
    public void setCname(String Cname) {
        this.Cname = Cname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getAccountnumber() {
        return accountnumber;
    }
    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }
    public int getContact() {
        return contact;
    }
    public void setContact(int contact) {
        this.contact = contact;
    }
    public int getBid() {
        return bid;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "Cid=" + Cid +
                ", Cname='" + Cname + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", balance=" + balance +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", bid=" + bid +
                '}';
    }



}
