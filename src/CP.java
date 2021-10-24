import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	
	public static Connection CreateC(){
		try {
			String url= "jdbc:mysql://localhost:3306/test";
			String uid= "root";
			String psw= "";
			// load Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// set connection
			con = DriverManager.getConnection(url, uid, psw); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
