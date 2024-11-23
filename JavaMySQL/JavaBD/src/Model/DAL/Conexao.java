package Model.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/javasabado";
    private static final String user = "root";
    private static final String passWord = "admin";

    private static Connection conn;

    public static Connection getConnection(){

        try {
            if (conn == null){
                conn = DriverManager.getConnection(url, user, passWord);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            //e.printStackTrace();
            return null;
        }
            
    }
}
