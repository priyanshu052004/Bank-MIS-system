package controller;

import model.HeadOfficeEntity;
import model.StateOfficeEntity;
import service.HeadOfficeService;
import service.StateOfficeService;
import service.impl.HeadOfficeServiceImpl;
import service.impl.StateOfficeServiceImpl;
import utils.CreateTable;
import utils.DBConnect;

import java.sql.Connection;

public class HeadOfficeController extends CreateTable {

    private static Connection con = DBConnect.makeConnection();
    private static HeadOfficeService headOfficeService = new HeadOfficeServiceImpl();

    private static final String query = "CREATE TABLE if not exists HeadOffice (Hid serial PRIMARY KEY, HeadOfficeName VARCHAR(255) unique, Address VARCHAR(255),Contact Int,Sid int unique)";



    public HeadOfficeController() {
        super(con);
        String message = (createTable(query)) ? "************* Headoffice table create *************" : "************* unable to create Customer table *************";
        System.out.println(message);
    }

    public static Connection getCon() {
        return con;
    }



    public void createHeadOffRecord(HeadOfficeEntity headOfficeEntity)
    {

        headOfficeService.createHeadOffRecord(con, headOfficeEntity);

    }
    public static void displayAllRecords()
    {

        HeadOfficeService.displayAllRecords(con);

    }
}
