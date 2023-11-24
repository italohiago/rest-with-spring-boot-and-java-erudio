package br.com.erudio.vo.v2;

import java.io.Serializable;
import java.util.Date;

public class PersonVOV2 implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private long id;
	private String firstName;
	private String lastName;
	private String adress;
	private String gender;
	
	private Date birthday;
	
	public PersonVOV2() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
