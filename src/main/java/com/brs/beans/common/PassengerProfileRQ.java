package com.brs.beans.common;

import java.util.Date;

// TODO: Auto-generated JavaDoc
/**
 * The Class PassengerProfileRQ.
 */
public class PassengerProfileRQ {

/** The name. */
private String name;

/** The email. */
private String email;

/** The mobile. */
private String mobile;

/** The gender. */
private String gender;

/** The dob. */
private Date dob;

/** The password. */
private String password;
//private Integer roleId;

/**
 * Gets the password.
 *
 * @return the password
 */
/*public Integer getRoleId() {
	return roleId;
}
public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}*/
public String getPassword() {
	return password;
}

/**
 * Sets the password.
 *
 * @param password the new password
 */
public void setPassword(String password) {
	this.password = password;
}

/**
 * Gets the name.
 *
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * Sets the name.
 *
 * @param name the new name
 */
public void setName(String name) {
	this.name = name;
}

/**
 * Gets the email.
 *
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * Sets the email.
 *
 * @param email the new email
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * Gets the mobile.
 *
 * @return the mobile
 */
public String getMobile() {
	return mobile;
}

/**
 * Sets the mobile.
 *
 * @param mobile the new mobile
 */
public void setMobile(String mobile) {
	this.mobile = mobile;
}

/**
 * Gets the gender.
 *
 * @return the gender
 */
public String getGender() {
	return gender;
}

/**
 * Sets the gender.
 *
 * @param gender the new gender
 */
public void setGender(String gender) {
	this.gender = gender;
}

/**
 * Gets the dob.
 *
 * @return the dob
 */
public Date getDob() {
	return dob;
}

/**
 * Sets the dob.
 *
 * @param dob the new dob
 */
public void setDob(Date dob) {
	this.dob = dob;
}


}
