package com.eCommerceProject.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;


public class PushEmailRequest {

    @Email
    private String eMail;

    @NotNull
    private String body;

    @NotNull
    private String title;

	public String getEMail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
