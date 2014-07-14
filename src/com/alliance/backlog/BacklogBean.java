package com.alliance.backlog;

public class BacklogBean {
	int backlog_id;
	int user_id;
	String backlog_title;
	String backlog_content;
	String backlog_start_time;
	String backlog_end_time;
	String backlog_state;
	public int getBacklog_id() {
		return backlog_id;
	}
	public void setBacklog_id(int backlogId) {
		backlog_id = backlogId;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int userId) {
		user_id = userId;
	}
	public String getBacklog_title() {
		return backlog_title;
	}
	public void setBacklog_title(String backlogTitle) {
		backlog_title = backlogTitle;
	}
	public String getBacklog_content() {
		return backlog_content;
	}
	public void setBacklog_content(String backlogContent) {
		backlog_content = backlogContent;
	}
	public String getBacklog_start_time() {
		return backlog_start_time;
	}
	public void setBacklog_start_time(String backlogStartTime) {
		backlog_start_time = backlogStartTime;
	}
	public String getBacklog_end_time() {
		return backlog_end_time;
	}
	public void setBacklog_end_time(String backlogEndTime) {
		backlog_end_time = backlogEndTime;
	}
	public String getBacklog_state() {
		return backlog_state;
	}
	public void setBacklog_state(String backlogState) {
		backlog_state = backlogState;
	}
}

