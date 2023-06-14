package web10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {

   private final static String UID = "root";
   private final static String PASS = "ss2414ss";
   private static String url = "jdbc:mysql://localhost:3306/mywork";
   private static String opt = "useUnicode=true&characterEncoding=UTF-8";
   private final static String URL;
   static {
      URL = url + "?" + opt;
   }
   
   public static void main(String[] args) {
    
     try {   
          //JDBC 메모리를 로딩하고 DriverManater에 등록
          Class.forName("com.mysql.cj.jdbc.Driver");
          
          //DB와 연결
          //java Connection 인터페이스는 AutoCloseable 인터페이스를 상속하고 있으므로 자동닫기 가능
          try(Connection conn = DriverManager.getConnection(URL, UID, PASS)){ 
            
             System.out.println("연결 성공");
          
          }catch(SQLException e) {
            e.printStackTrace();
           }
           
          System.out.println("연결 끊김");
           
     }catch(ClassNotFoundException e) {
        e.printStackTrace();
     }
     
   }
}
