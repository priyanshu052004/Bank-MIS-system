package utils;

import java.sql.*;

public class PrintTable {
	 private static Connection con = DBConnect.makeConnection();
    public static ResultSet displayAllRecords( String tableName) {
        final String query = "select * from "+tableName;

        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet;
//            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
//            int count = resultSetMetaData.getColumnCount();
////            column headers
//            for (int i =1; i<= count; i++)
//            {
//                System.out.print(resultSetMetaData.getColumnName(i)+" |");
//            }
//            System.out.println();
//
////            column data row by row
//            while (resultSet.next())
//            {
//                for (int i =1; i<= count; i++)
//                {
//                    System.out.print(resultSet.getString(i)+" |");
//                }
//                System.out.println();
//            }
////            System.out.println("count "+count);

        } catch (SQLException e) {
            System.out.println("******************* Unable create state office record *******************");
            System.out.println("message : "+e.getMessage());
//            throw new RuntimeException(e);
            return null;
        }
    }
}
