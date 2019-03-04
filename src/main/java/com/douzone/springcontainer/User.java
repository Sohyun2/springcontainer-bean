package com.douzone.springcontainer;

import java.util.List;

public class User {
	private Long no;
	private String name = "이소현";
	private Friend friend;
	private List<String> friends;0

	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(String name, Long no) {
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public Friend getFriend() {
		return friend;
	}
	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", friends=" + friends + "]";
	}
	
	
}
