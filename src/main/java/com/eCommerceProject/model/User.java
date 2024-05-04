package com.eCommerceProject.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "{com.eCommerceProject.notnull.username.message}")
    @Column(name = "username")
    private String userName;

    @NotNull(message = "{com.eCommerceProject.notnull.password.message}")
    @Column(name = "password")
    private String password;

    @Email(message = "{com.eCommerceProject.email.message}")
    @Column(name = "email")
    private String eMail;

    @Column(name = "createDate")
    private Date userCreateDate;

    @Column(name = "notificationPermission")
    private boolean notificationPermission = true;

    @OneToMany
    private List<SellerComment> sellerComment;

    @OneToMany
    private List<ProductComment> productComment;

    @ManyToOne
    private CreditCard creditCard;

    @OneToMany
    private List<Address> address;

    @OneToMany
    private List<PromoCode> promoCode;

    public User(String userName, String password, String eMail, Date userCreateDate, boolean notificationPermission) {
        this.userName = userName;
        this.password = password;
        this.eMail = eMail;
        this.userCreateDate = userCreateDate;
        this.notificationPermission = notificationPermission;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Date getUserCreateDate() {
		return userCreateDate;
	}

	public void setUserCreateDate(Date userCreateDate) {
		this.userCreateDate = userCreateDate;
	}

	public boolean isNotificationPermission() {
		return notificationPermission;
	}

	public void setNotificationPermission(boolean notificationPermission) {
		this.notificationPermission = notificationPermission;
	}

	public List<SellerComment> getSellerComment() {
		return sellerComment;
	}

	public void setSellerComment(List<SellerComment> sellerComment) {
		this.sellerComment = sellerComment;
	}

	public List<ProductComment> getProductComment() {
		return productComment;
	}

	public void setProductComment(List<ProductComment> productComment) {
		this.productComment = productComment;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<PromoCode> getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(List<PromoCode> promoCode) {
		this.promoCode = promoCode;
	}

	

	public String getEMail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEMail(String eMail2) {
		// TODO Auto-generated method stub
		
	}
    

}
