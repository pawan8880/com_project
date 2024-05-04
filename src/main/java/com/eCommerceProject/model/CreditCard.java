package com.eCommerceProject.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
//@NoArgsConstructor
@Entity
@Table(name = "CREDİT_CARD")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cardNumber")
    private String cardNumber;

    @Column(name = "cvv")
    private int cvv;

    @Column(name = "expirationDate")
    private String expirationDate;

    @Column(name = "nameAndSurname")
    private String nameAndSurname;

    @ManyToOne
    private User user;

    public CreditCard(String cardNumber, int cvv, String expirationDate, String nameAndSurname) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.nameAndSurname = nameAndSurname;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getNameAndSurname() {
		return nameAndSurname;
	}

	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CreditCard(int id, String cardNumber, int cvv, String expirationDate, String nameAndSurname, User user) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expirationDate = expirationDate;
		this.nameAndSurname = nameAndSurname;
		this.user = user;
	}

	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
