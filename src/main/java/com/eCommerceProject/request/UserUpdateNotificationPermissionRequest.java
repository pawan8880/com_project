package com.eCommerceProject.request;

import lombok.Data;

@Data
public class UserUpdateNotificationPermissionRequest {

    private int userId;

    private boolean permission;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isPermission() {
		return permission;
	}

	public void setPermission(boolean permission) {
		this.permission = permission;
	}

	
}
