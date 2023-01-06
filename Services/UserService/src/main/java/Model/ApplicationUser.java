package Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "users")
public class ApplicationUser {

	@Id
	private Long id;
	
	@Field(value = "email")
	private String email;
	
	@Field(value = "password")
	private String password;
	
	@Field(value = "name")
	private String name;
	
	@Field(value = "surname")
	private String surname;
	
	@Field(value = "address")
	private String address;
	
	@Field(value = "telephone")
	private String telephone;
	
	@Field(value = "loyaltyPoints")
	private int loyaltyPoints;
	
	@Field(value = "loyaltyType")
	private ApplicationLoyaltyType loyaltyType;
	
	@Field(value = "userType")
	private ApplicationUserType userType;

	public ApplicationUser(Long id, String email, String password, String name, String surname, String address,
			String telephone, ApplicationUserType userType) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		this.userType = userType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getLoyaltyPoints() {
		return loyaltyPoints;
	}

	public void setLoyaltyPoints(int loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}

	public ApplicationLoyaltyType getLoyaltyType() {
		return loyaltyType;
	}

	public void setLoyaltyType(ApplicationLoyaltyType loyaltyType) {
		this.loyaltyType = loyaltyType;
	}

	public ApplicationUserType getUserType() {
		return userType;
	}

	public void setUserType(ApplicationUserType userType) {
		this.userType = userType;
	}
}
