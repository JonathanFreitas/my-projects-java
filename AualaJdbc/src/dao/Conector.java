package dao;

import java.sql.*;


public class Conector {
    
    public static Connection conector(){
     java.sql.Connection conexao= null;
     String driver = "com.mysql.jdbc.Driver";
     
     String url = "jdbc:mysql://localhost:3306/test";
     String user = "root";
     String password = "";
     
            try {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }
        
        
    }
    
   

}
