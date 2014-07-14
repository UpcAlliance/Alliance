package com.alliance.department;

import java.sql.*;
import java.util.ArrayList;

import com.alliance.db.AllianceDB;

public class DepartmentDao extends AllianceDB{
	public Connection conn = null;
	public PreparedStatement prepStmt = null;
	public ResultSet rs = null;
	public ArrayList<DepartmentBean> selectallDepartment() {
		ArrayList<DepartmentBean> list = new ArrayList<DepartmentBean>();
		try {
			conn = AllianceDB.openDB();
			if(conn!=null)
			{
				String sql = "select * from department_tab";
				prepStmt = conn.prepareStatement(sql);
				rs = prepStmt.executeQuery();
				while (rs.next()) {
					DepartmentBean dep = new DepartmentBean();
					dep.setDepartment_id(rs.getInt(1));
					dep.setDepartment_name(rs.getString(2));
					list.add(dep);
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				AllianceDB.closeDB();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
