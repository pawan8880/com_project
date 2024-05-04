package com.eCommerceProject.request;




import java.util.Date;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SellerCommentCreateRequest {

    private String title;

    private String body;

    @NotNull
    @Min(value = 1)
    private int rating;

    private Date createDate;

    public SellerCommentCreateRequest(String title, String body, int rating, Date createDate) {
        this.title = title;
        this.body = body;
        this.rating = rating;
        this.createDate = createDate;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


}
