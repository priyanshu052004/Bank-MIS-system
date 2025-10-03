package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    static Connection con;
    public static Connection makeConnection()
    {
        try {
        	 
				Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_mis_bb", "postgres", "postgres");
            System.out.println("**************** connection build successfully ****************");
            return con;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


//    public static void main(String[] args) {
//        makeConnection();
//        try {
////            String query =  "select * from customer";
////            String query = "drop table customer";
//            String query =  "CREATE TABLE if not exists Customer (Cid int Primary key, Cname varchar(20),address varchar(20), balanace int, accountnumer int, contact int, bid int )";
//            Statement statement = con.createStatement();
//            System.out.println("output "+statement.execute(query));
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
