package com.alliance.user;

public class UserBean {
	int user_id;
	String user_name;
	String user_gender;
	int department_id;
	String position;
	String password;
	String phone;
	String profile;
	String permission;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int userId) {
		user_id = userId;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String userName) {
		user_name = userName;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String userGender) {
		user_gender = userGender;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int departmentId) {
		department_id = departmentId;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
}