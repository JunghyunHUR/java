package web12.net.musecom;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private final String uid = "root";
	private final String pass = "ss2414ss";
	private final String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=UTF-8";
	private final String driver = "com.mysql.cj.jdbc.Driver";
	
	private Connection conn;
	
	//Connection at Constructor
	public DBConnect() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, pass);
			System.out.println("DB접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//method
	public Connection getConn() {
		return this.conn;
	}

}
