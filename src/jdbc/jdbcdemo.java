package jdbc;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdemo {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost/java";
		Connection conn = null;
		
		int rollno = 2;
		String name = "John";
		int age = 22;
		String sql = "INSERT INTO student(rollno, name, age) "+"VALUES("+rollno+",'"+name+"',"+age+")";
//		System.out.print(sql);
		try {
			
			conn = DriverManager.getConnection(url,"postgres","word");
//			System.out.print(conn);
			Statement st = conn.createStatement();
			int m = st.executeUpdate(sql);
			if(m==1)
				System.out.println("inserted successfully: "+sql);
			else {
				System.out.println("insertion failed");
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			conn.close();
		}
	}
}
