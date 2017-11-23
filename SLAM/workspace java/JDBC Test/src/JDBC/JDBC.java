package JDBC;

import java.sql.*;

public class JDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Connection conn = BDDConnect();
		Statement st = conn.createStatement();
		String sql = "INSERT INTO user(name, age) VALUES ('Luc', '23')";
		st.executeUpdate(sql);
		BDDDisconnect(conn);
	}
	public static Connection BDDConnect() throws ClassNotFoundException{
		String databaseURL = "jdbc:mysql://localhost:3306/jdbc?user=root&password=";
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			conn = DriverManager.getConnection(databaseURL);
			if (conn != null) {
				System.out.println("Connected to the database");
			}
		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		}
		return conn;
	}
	public static void BDDDisconnect(Connection conn){
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}