package com.sy.s1.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {
	
	public Connection getConnect() {
		   
		   String user = "user02";
		   String pw = "user02";
		   String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		   String driver = "oracle.jdbc.driver.OracleDriver";   
		   Connection con = null;
		   
		   try {
			  Class.forName(driver);
			   
		      con = DriverManager.getConnection(url, user, pw);
		   } catch (Exception e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		   }
		   return con;
		   }
	
	public void disConnect(ResultSet rs, PreparedStatement st, Connection con) {
		try {
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void disConnect(PreparedStatement st, Connection con) {
		try {
			st.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
