package controller;

import model.CustomerEntity;
import service.CustomerService;
import service.impl.CustomerServiceImpl;
import utils.CreateTable;
import utils.DBConnect;

import java.sql.Connection;

public class CustomerController extends CreateTable {
    private static Connection con = DBConnect.makeConnection();
    private static CustomerService customerService = new CustomerServiceImpl();

    private static final String query ="CREATE TABLE  if not exists Customer (Cid serial PRIMARY KEY, Cname VARCHAR(100), address VARCHAR(255),balance INT,accountnumber INT unique ,contact INT unique, bid int)";

    public CustomerController()
    {
        super(con);
        String message = (createTable(query)) ? "************* Customer table create *************" : "************* unable to create Customer table *************";
        System.out.println(message);


    }

    public static Connection getCon() {
        return con;
    }


    public static void createCustomerRecord(CustomerEntity customerEntity){
        customerService.createCustomerRecord(con,customerEntity);


    }
    public void updateCustomerRecord(CustomerEntity customerEntity)
    {
        customerService.updateCustomerRecord(con, customerEntity);
    }
    public void deleteCustomerRecord(CustomerEntity customerEntity)
    {
        customerService.deleteCustomerRecord(con,customerEntity);
    }



}
