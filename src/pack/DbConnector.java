package pack;


import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnector {
    
    public static Connection getConnection() {
        Connection conn = null;
        String link = "jdbc:mysql://localhost:3306/cocktail?serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(link, "root", "0904140212");
            System.out.println("Connected to the database");
    } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
     public static void main(String arg[]){
        DbConnector.getConnection();
    }
}
