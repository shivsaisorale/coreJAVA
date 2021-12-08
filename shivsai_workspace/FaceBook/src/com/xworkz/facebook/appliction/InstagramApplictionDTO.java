package com.xworkz.facebook.appliction;

public class InstagramApplictionDTO {

	int totalUsers;
	float serverLocation;
	
	public InstagramApplictionDTO() {
		System.out.println("Invoked  no-arg const");
	}

	public InstagramApplictionDTO(int totalUsers, float serverLocation) {
		super();
		this.totalUsers = totalUsers;
		this.serverLocation = serverLocation;
	}

	public int getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}

	public float getServerLocation() {
		return serverLocation;
	}

	public void setServerLocation(float serverLocation) {
		this.serverLocation = serverLocation;
	}
	
	
}
