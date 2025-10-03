package service;

import model.CustomerEntity;

import java.sql.Connection;

public interface CustomerService {

  void createCustomerRecord(Connection con, CustomerEntity customerEntity);
  void updateCustomerRecord(Connection con, CustomerEntity customerEntity);
  void deleteCustomerRecord(Connection con, CustomerEntity customerEntity);


}
