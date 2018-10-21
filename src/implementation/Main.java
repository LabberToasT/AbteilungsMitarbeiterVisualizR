package implementation;

import implementation.Fachkonzept.Fachkonzept;
import implementation.Fachkonzept.GUI;
import implementation.Persistence.XML.XMLHelper;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    // TODO refine me
    public static void main(String args[]) {
        System.out.println("Hello World!");

        createNewDatabase("test.db");
    }

    public static void createNewDatabase(String databaseName) {
        String url = "jdbc:sqlite:C:/sqlite/db/" + databaseName;

        try (Connection con = DriverManager.getConnection(url)) {
            if (null != con) {
                DatabaseMetaData meta = con.getMetaData();

                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created");
            }
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }

    public static void test() {
        Fachkonzept fachkonzept = new GUI(new XMLHelper());
    }
}