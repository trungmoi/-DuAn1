/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static Connection conn;
    public static Connection getConN(){
    try {
        if(conn == null){
            String dbUser = "sa",dbPass = "123",
                   dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=test_1;"
                    + "encrypt=true;trustServerCertificate=true;";
        conn = DriverManager.getConnection(dbUrl,dbUser,dbPass);
        System.out.println("ok");
        }
        } catch (SQLException e) {
            System.out.println("Loi: "+e);
        }
    return conn;
    }
    public static void main(String[] args) {
        Connection conn = getConN();
    }
}
