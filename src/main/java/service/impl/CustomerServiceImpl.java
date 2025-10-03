package service.impl;

import model.CustomerEntity;
import service.CustomerService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void createCustomerRecord(Connection con, CustomerEntity customerEntity) {

        final String query = "insert into Customer (Cname, address, balance, accountnumber,contact,bid) values (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);


            preparedStatement.setString(1,customerEntity.getCname());
            preparedStatement.setString(2, customerEntity.getAddress());
            preparedStatement.setInt(3, customerEntity.getBalance());
            preparedStatement.setInt(4, customerEntity.getAccountnumber());
            preparedStatement.setInt(5, customerEntity.getContact());
            preparedStatement.setInt(6, customerEntity.getBid());

//            execute query
            if(!preparedStatement.execute()) System.out.println("******************* created Customer  record *******************");


        } catch (SQLException e) {
            System.out.println("******************* Unable create Customer record *******************");
            System.out.println("message : "+e.getMessage());
//            throw new RuntimeException(e);

        }

    }

    public void updateCustomerRecord(Connection con, CustomerEntity customerEntity) {
        final String query ="UPDATE Customer SET Cname = ?, address = ?, balance = ?, contact = ?, bid = ? WHERE accountnumber = ?;";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);


            preparedStatement.setString(1, customerEntity.getCname());
            preparedStatement.setString(2, customerEntity.getAddress());
            preparedStatement.setInt(3, customerEntity.getBalance());
            preparedStatement.setInt(4, customerEntity.getContact());
            preparedStatement.setInt(5, customerEntity.getBid());
            preparedStatement.setInt(6, customerEntity.getAccountnumber());
            int count = preparedStatement.executeUpdate();
            System.out.println("row effected "+count);

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteCustomerRecord(Connection con, CustomerEntity customerEntity) {
        final String query = "DELETE FROM Customer WHERE accountnumber = ?;";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, customerEntity.getAccountnumber());
            int count = preparedStatement.executeUpdate();
            System.out.println("row Deleted "+count);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
