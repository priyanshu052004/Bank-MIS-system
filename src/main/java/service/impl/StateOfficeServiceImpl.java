package service.impl;

import model.StateOfficeEntity;
import service.StateOfficeService;

import java.sql.*;

public class StateOfficeServiceImpl implements StateOfficeService {

    @Override
    public void createStateOffRecord(Connection con, StateOfficeEntity stateOfficeEntity) {
//        insert into StateOffice (stateOfficeName, address, pincode, city) values (? , ?, ?, ?)
        final String query = "insert into StateOffice (stateOfficeName, address, pincode, city) values (?, ?, ?, ?)";


;
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);

//           setting values of ? (Parameter positioning )
            preparedStatement.setString(2, stateOfficeEntity.getAddress());
            preparedStatement.setString(1,stateOfficeEntity.getStateOfficeName());
            preparedStatement.setString(3, stateOfficeEntity.getPincode());
            preparedStatement.setString(4, stateOfficeEntity.getCity());

//            execute query
            if(!preparedStatement.execute()) System.out.println("******************* created state office record *******************");


        } catch (SQLException e) {
            System.out.println("******************* Unable create state office record *******************");
            System.out.println("message : "+e.getMessage());
//            throw new RuntimeException(e);

        }
    }

    public void updateAdd(Connection con, StateOfficeEntity stateOfficeEntity) {
        final String query = "UPDATE StateOffice\n" +
                "SET address = ?, \n" +
                "    pincode = ?, \n" +
                "    city = ?\n" +
                "WHERE sid = ?;\n";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1 , stateOfficeEntity.getAddress());
            preparedStatement.setString(2 , stateOfficeEntity.getPincode());
            preparedStatement.setString(3 , stateOfficeEntity.getCity());
            preparedStatement.setInt(4 , stateOfficeEntity.getsId());

            int count = preparedStatement.executeUpdate();
            System.out.println("row effected "+count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Connection con, StateOfficeEntity stateOfficeEntity)
    {
        final String query = "DELETE FROM StateOffice WHERE sid = ?";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, stateOfficeEntity.getsId());

            int count = preparedStatement.executeUpdate();
            System.out.println("row Deleted "+count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
