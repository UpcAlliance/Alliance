package com.alliance.announcement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alliance.db.AllianceDB;
import com.alliance.announcement.AnnouncementBean;

public class AnnouncementDAO {
	public Connection conn = null;
	public PreparedStatement prepStmt = null;
	public ResultSet rs = null;
	public int addAnnouncement(AnnouncementBean ab) throws SQLException
	{
		try{
			conn = AllianceDB.openDB();
			if(conn!=null)
			{
				String sql = "insert into announcement_tab values(?,?,?,?,?)";
				prepStmt = conn.prepareStatement(sql);
				prepStmt.setInt(1, ab.getAnnouncement_id());
				prepStmt.setString(2, ab.getAnnouncement_title());
				prepStmt.setString(3, ab.getAnnouncement_content());
				prepStmt.setInt(4, ab.getAnnouncement_publisher());
				prepStmt.setString(5, ab.getAnnouncement_time());
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
	public AnnouncementBean getAllAnnouncement() throws SQLException
	{
		try{
			conn = AllianceDB.openDB();
			AnnouncementBean ab = new AnnouncementBean();
			if(conn!=null)
			{
				String sql = "select * from announcement_tab";
				prepStmt = conn.prepareStatement(sql);
				rs = prepStmt.executeQuery();
				ab.setAnnouncement_id(rs.getInt(1));
				ab.setAnnouncement_title(rs.getString(2));
				ab.setAnnouncement_content(rs.getString(3));
				ab.setAnnouncement_publisher(rs.getInt(4));
				ab.setAnnouncement_time(rs.getString(5));
			}
			return ab;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			try {
				AllianceDB.closeDB();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public AnnouncementBean getAnnouncementWithTitleOf(String tit) throws SQLException
	{
		try{
			conn = AllianceDB.openDB();
			AnnouncementBean ab = new AnnouncementBean();
			if(conn!=null)
			{
				String sql = "select * from announcement_tab where announcement_title = ?";
				prepStmt.setString(1,tit);
				prepStmt = conn.prepareStatement(sql);
				rs = prepStmt.executeQuery();
				ab.setAnnouncement_id(rs.getInt(1));
				ab.setAnnouncement_title(rs.getString(2));
				ab.setAnnouncement_content(rs.getString(3));
				ab.setAnnouncement_publisher(rs.getInt(4));
				ab.setAnnouncement_time(rs.getString(5));
			}
			return ab;
		}catch(Exception e){
			e.printStackTrace();
			return null;
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
