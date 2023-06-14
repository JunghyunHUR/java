package web12.net.musecom;

import java.sql.Connection;

public class ConnectionExam {
	
	public static void main(String[] args) {
		
		Connection conn = new DBConnect().getConn();
		
	}

}
