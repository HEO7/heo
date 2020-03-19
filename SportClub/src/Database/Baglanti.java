package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Baglanti {
	
	static Connection conn;
	static Statement st;

	public static ResultSet yap() {
		ResultSet rs = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SCDB","postgres","7777");
			st = (Statement) conn.createStatement();
			rs = st.executeQuery("select * from members");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
		
	}
	
	public static void ekle(String sql_sorgu) {
		
		try {
			st.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static ResultSet sorgu(String sql_sorgu) {
		
		ResultSet rs = null;
		
		try {
			rs = st.executeQuery(sql_sorgu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
		
		
		
	}
	
}
