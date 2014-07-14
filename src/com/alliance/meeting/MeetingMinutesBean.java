package com.alliance.meeting;

public class MeetingMinutesBean {
	int meeting_id;
	String meeting_room_name;
	int meeting_organizer_id;
	String meeting_start_time;
	String meeting_end_time;
	public int getMeeting_id() {
		return meeting_id;
	}
	public void setMeeting_id(int meetingId) {
		meeting_id = meetingId;
	}
	public String getMeeting_room_name() {
		return meeting_room_name;
	}
	public void setMeeting_room_name(String meetingRoomName) {
		meeting_room_name = meetingRoomName;
	}
	public int getMeeting_organizer_id() {
		return meeting_organizer_id;
	}
	public void setMeeting_organizer_id(int meetingOrganizerId) {
		meeting_organizer_id = meetingOrganizerId;
	}
	public String getMeeting_start_time() {
		return meeting_start_time;
	}
	public void setMeeting_start_time(String meetingStartTime) {
		meeting_start_time = meetingStartTime;
	}
	public String getMeeting_end_time() {
		return meeting_end_time;
	}
	public void setMeeting_end_time(String meetingEndTime) {
		meeting_end_time = meetingEndTime;
	}
}