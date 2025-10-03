package service.impl;

import model.HeadOfficeEntity;
import service.HeadOfficeService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HeadOfficeServiceImpl implements HeadOfficeService {

    public void createHeadOffRecord(Connection con, HeadOfficeEntity headOfficeEntity) {
        final String query = "INSERT INTO headoffice(HeadOfficeName, Address, Contact,Sid) VALUES (?, ?, ?,?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {

            // Set parameters for the PreparedStatement

            preparedStatement.setString(1, headOfficeEntity.getHeadOfficeName());
            preparedStatement.setString(2, headOfficeEntity.getaddress());
            preparedStatement.setInt(3, headOfficeEntity.getcontact());


            // Execute query
            if (!preparedStatement.execute()) {
                System.out.println("******************* Created Head Office record successfully *******************");
            }

        } catch (SQLException e) {
            System.out.println("******************* Unable to create Head Office record *******************");
            System.out.println("Message : " + e.getMessage());
        }
    }


    public void displayAllRecords(Connection con) {
        final String query = "select * from HeadOffice";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
//           int count =0;
            while (resultSet.next())
            {
                System.out.println("Hid "+resultSet.getString(1)+" HeadOffice name: "+resultSet.getString(2)+" Address: "+resultSet.getString(3)+" Contact "+resultSet.getString(4)+" Sid : "+ resultSet.getString(5));
            }
//            System.out.println("count "+count);

        } catch (SQLException e) {
            System.out.println("******************* Unable create Head office record *******************");
            System.out.println("message : "+e.getMessage());
//            throw new RuntimeException(e);

        }
    }
}
