package com.alliance.db;

import java.sql.*;

import com.alliance.declare.Declare;

public class AllianceDB {
	public static Connection conn = null;

	public static Connection openDB() throws Exception {
		try {
			if (conn==null) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = java.sql.DriverManager.getConnection("jdbc:mysql://"
						+ Declare.serverIp + ":3306" + "/" + Declare.dbName,
						Declare.dbUserName, Declare.dbUserPwd);
			}
			else if(conn.isClosed() == true)
			{
				Class.forName("com.mysql.jdbc.Driver");
				conn = java.sql.DriverManager.getConnection("jdbc:mysql://"
						+ Declare.serverIp + ":3306" + "/" + Declare.dbName,
						Declare.dbUserName, Declare.dbUserPwd);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeDB() throws Exception {
		if (conn != null) {
			conn.close();
		}
	}
}
