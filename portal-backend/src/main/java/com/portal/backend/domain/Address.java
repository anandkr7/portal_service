package com.portal.backend.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "address_id", nullable = false)
	private User user;
	
	@Column(name = "first_street")
	private String firstStreet;
	
	@Column(name = "second_street")
	private String secondStreet;
	
	@Column(name = "landmark")
	private String landmark;
	
	@Column(name = "pincode")
	private String pincode;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;

	public String getFirstStreet() {
		return firstStreet;
	}

	public void setFirstStreet(String firstStreet) {
		this.firstStreet = firstStreet;
	}

	public String getSecondStreet() {
		return secondStreet;
	}

	public void setSecondStreet(String secondStreet) {
		this.secondStreet = secondStreet;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [firstStreet=" + firstStreet + ", secondStreet=" + secondStreet + ", landmark=" + landmark
				+ ", pincode=" + pincode + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
