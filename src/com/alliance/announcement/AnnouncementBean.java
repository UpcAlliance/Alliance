package com.alliance.announcement;

public class AnnouncementBean {
	int announcement_id;
	String announcement_title;
	String announcement_content;
	int announcement_publisher;
	String announcement_time;
	public int getAnnouncement_id() {
		return announcement_id;
	}
	public void setAnnouncement_id(int announcementId) {
		announcement_id = announcementId;
	}
	public String getAnnouncement_title() {
		return announcement_title;
	}
	public void setAnnouncement_title(String announcementTitle) {
		announcement_title = announcementTitle;
	}
	public String getAnnouncement_content() {
		return announcement_content;
	}
	public void setAnnouncement_content(String announcementContent) {
		announcement_content = announcementContent;
	}
	public int getAnnouncement_publisher() {
		return announcement_publisher;
	}
	public void setAnnouncement_publisher(int announcementPublisher) {
		announcement_publisher = announcementPublisher;
	}
	public String getAnnouncement_time() {
		return announcement_time;
	}
	public void setAnnouncement_time(String announcementTime) {
		announcement_time = announcementTime;
	}
}
