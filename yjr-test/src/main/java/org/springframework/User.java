package org.springframework;

import lombok.Data;
import lombok.Getter;

public class User {
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
