package com.eCommerceProject.request;




import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SellerCreateRequest {

    @NotNull
    private String name;

    private String profilePictureUrl;

    @NotNull
    @Email
    private String eMail;

    private Date createDate;

    public SellerCreateRequest(String name, String profilePictureUrl, String eMail, Date createDate) {
        this.name = name;
        this.profilePictureUrl = profilePictureUrl;
        this.eMail = eMail;
        this.createDate = createDate;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePictureUrl() {
		return profilePictureUrl;
	}

	public void setProfilePictureUrl(String profilePictureUrl) {
		this.profilePictureUrl = profilePictureUrl;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getEMail() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
