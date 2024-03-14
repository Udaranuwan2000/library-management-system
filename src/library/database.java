
package library;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hndit2
 */
public class database {
    
    
    public static Connection connection(){
    
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            return con;
        
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }
}
