package com.example.springapp.springapp.models;

import java.util.Date;

import org.bson.types.ObjectId;

public class Users {
	
	public ObjectId _id;
	public String fName;
	public String lName;
	public String userName;
	public String email;
	public Boolean emailVerified;
	public String password;
	public Number mobileNumber;
	public Date birthDate;
	public Date createdAt;
	public Date updateAt;
	
	//Default Constructor
	public Users() {}
	
	public Users(ObjectId _id, String fName, String lName, String userName, String email, Boolean emailVerified,
			String password, Number mobileNumber, Date birthDate, Date createdAt, Date updateAt) {
		super();
		this._id = _id;
		this.fName = fName;
		this.lName = lName;
		this.userName = userName;
		this.email = email;
		this.emailVerified = emailVerified;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.birthDate = birthDate;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}
	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Number getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Number mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	@Override
	public String toString() {
		return "User [_id=" + _id + ", fName=" + fName + ", lName=" + lName + ", userName=" + userName + ", email="
				+ email + ", emailVerified=" + emailVerified + ", password=" + password + ", mobileNumber="
				+ mobileNumber + ", birthDate=" + birthDate + ", createdAt=" + createdAt + ", updateAt=" + updateAt
				+ "]";
	}
	
}
