package utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    private Connection con = null;

    public CreateTable(Connection con)
    {
        this.con = con;
    }

    protected boolean createTable(String query)
    {
        try {
            Statement statement = con.createStatement();
            statement.execute(query);
            return true;
        } catch (SQLException e) {
            System.out.println("message "+e.getMessage());
            return false;
        }
    }
}
