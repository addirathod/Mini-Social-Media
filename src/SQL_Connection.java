
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MAHE
 */
public class SQL_Connection {
    public java.sql.Connection getConnection()
    {
        java.sql.Connection con=null;
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project","root","a1b2c3d4");
        }
        catch(Exception e)
        {
        
        }
        return con;
    }
}
