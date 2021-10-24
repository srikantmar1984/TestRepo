import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	
	public static boolean insertStudentToDB(Student st) {
		// TODO Auto-generated method stub
		boolean sts= false;
		try {
			Connection con = CP.CreateC();
			String Sql = "insert into Student(name, class, city) values(?,?,?)";
			
			// PREPAREDsTATEMENT 
			PreparedStatement pst = con.prepareStatement(Sql);
			pst.setString(1, st.getName());
			pst.setInt(2,st.getStd());
			pst.setString(3,st.getCity());
			pst.executeUpdate();
			sts= true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sts;
	}

	public static boolean delStudentRecord(int sid) {
		// TODO Auto-generated method stub
		boolean d_sts= false;
		try {
			Connection con = CP.CreateC();
			String Sql = "delete from Student where id =  ?";
			
			// PREPAREDsTATEMENT 
			PreparedStatement pst = con.prepareStatement(Sql);
			
			pst.setInt(1,sid);
			
			pst.executeUpdate();
			d_sts= true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return d_sts;
	}

	public static void displayStudent() {
		// TODO Auto-generated method stub
		try {
			
			Connection con = CP.CreateC();
			String sql = "SELECT * FROM STUDENT";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				int id = rs.getInt(1);
				String nm = rs.getString(2);
				int std = rs.getInt("class");
				String city = rs.getString(4);
				
				System.out.println("ID="+ id);
				System.out.println("Name="+ nm);
				System.out.println("std="+ std);
				System.out.println("city="+ city);
				System.out.println("+++++++++++=");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void displayUpdRecord(int sid) {
		// TODO Auto-generated method stub
		try {
			
			Connection con = CP.CreateC();
			String sql = "SELECT * FROM STUDENT WHERE ID="+sid;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				int id = rs.getInt(1);
				String nm = rs.getString(2);
				int std = rs.getInt("class");
				String city = rs.getString(4);
				
				System.out.println("ID="+ id);
				System.out.println("Name="+ nm);
				System.out.println("std="+ std);
				System.out.println("city="+ city);
				System.out.println("+++++++++++=");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean updateStudentToDB(Student st) {
		// TODO Auto-generated method stub
		boolean sts= false;
		try {
			Connection con = CP.CreateC();
			String Sql = "UPDATE Student SET name= ?, class=?, city=? WHERE id =?";
			
			// PREPAREDsTATEMENT 
			PreparedStatement pst = con.prepareStatement(Sql);
			pst.setString(1, st.getName());
			pst.setInt(2,st.getStd());
			pst.setString(3,st.getCity());
			pst.setInt(4, st.getId());
			pst.executeUpdate();
			sts= true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sts;
		
		
	}

	
}
