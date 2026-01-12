package hospital.management;


import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/medical_records_db","root","");
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }
        return con;
        
    }
}
