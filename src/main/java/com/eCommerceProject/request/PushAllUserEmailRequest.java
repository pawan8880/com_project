package com.eCommerceProject.request;

import jakarta.validation.constraints.NotNull;

public class PushAllUserEmailRequest {

    @NotNull
    private String body;

    @NotNull
    private String title;

	public String getBody() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
