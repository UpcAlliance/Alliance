package com.alliance.message;

public class MessageBean {
	int message_id;
	int receiver_id;
	int sender_id;
	String message_content;
	String message_state;
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int messageId) {
		message_id = messageId;
	}
	public int getReceiver_id() {
		return receiver_id;
	}
	public void setReceiver_id(int receiverId) {
		receiver_id = receiverId;
	}
	public int getSender_id() {
		return sender_id;
	}
	public void setSender_id(int senderId) {
		sender_id = senderId;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String messageContent) {
		message_content = messageContent;
	}
	public String getMessage_state() {
		return message_state;
	}
	public void setMessage_state(String messageState) {
		message_state = messageState;
	}
}
