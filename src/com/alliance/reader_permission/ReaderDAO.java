package com.alliance.reader_permission;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alliance.db.AllianceDB;

public class ReaderDAO{
	public Connection conn = null;
	public PreparedStatement prepStmt = null;
	public ResultSet rs = null;
	public int addReaderPermission(ReaderBean rb) throws SQLException
	{
		try{
			conn = AllianceDB.openDB();
			if(conn!=null)
			{
				String sql = "insert into reader_permission_tab values(?,?)";
				prepStmt = conn.prepareStatement(sql);
				prepStmt.setInt(1, rb.getAuthorizer_id());
				prepStmt.setInt(2, rb.getAuthorizee_id());
				prepStmt.executeUpdate();
			}
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			try {
				AllianceDB.closeDB();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
