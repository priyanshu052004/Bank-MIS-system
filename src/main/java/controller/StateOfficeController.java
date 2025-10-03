package controller;

import model.StateOfficeEntity;
import service.StateOfficeService;
import service.impl.StateOfficeServiceImpl;
import utils.CreateTable;
import utils.DBConnect;

import java.sql.Connection;

public class StateOfficeController extends CreateTable {
    private static Connection con = DBConnect.makeConnection();
    private static StateOfficeService stateOfficeService = new StateOfficeServiceImpl();

    private static final String query = "CREATE TABLE if not exists StateOffice (sid serial PRIMARY KEY, stateOfficeName VARCHAR(255) unique, address VARCHAR(255), pincode VARCHAR(20), city VARCHAR(100))";

    public static Connection getCon() {
        return con;
    }

    public StateOfficeController()
    {
        super(con);
//        (f) ? "true" : "false"
       String message = (createTable(query)) ? "************* state office table create *************" : "************* unable to create state office table *************";
        System.out.println(message);


    }

    public void createStateOffRecord(StateOfficeEntity stateOfficeEntity)
    {
        stateOfficeService.createStateOffRecord(con, stateOfficeEntity);
    }

    public void updateAdd(StateOfficeEntity stateOfficeEntity)
    {
        stateOfficeService.updateAdd(con, stateOfficeEntity);
    }

    public void delete(StateOfficeEntity stateOfficeEntity)
    {
        stateOfficeService.delete(con, stateOfficeEntity);
    }

}
