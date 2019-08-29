//java package(sibasish)
package com.maren.myproject.model;
//class profile(sibasish)
    
public class Profile
 {
	//private access specifier so that it can be only accessed inside the same class(sibasish)
	private String userid;

	private String name;

	private String email;

	private long mobile;
      	
	
	//deafault contsructor(sibasish)
public Profile() {

	}
//copy constructor(sibasish)
	public Profile(String userid, String name, String email, long mobile) {
//super keyword is the reference variable that is used to refer parent class objects(s)
		super();
//this keyword works as a refernce for the current object(sibasish)
	this.userid = userid;

	this.name = name;
	
	this.email = email;

		this.mobile = mobile;
	
}
	//returns the value of variable userid(sibasish)
	public String getUserid()
 {
		return userid;

	}
	//sets the value of userid(sibasish)
	public void setUserid(String userid) {

		this.userid = userid;
	
	}
	//returns the value of variable name(sibasish)
	public String getName() {
	
	return name;
	
	}
   //sets the value of name(sibasish)
	public void setName(String name) {

		this.name = name;
	
}
    //returns the value of variable email(sibasish)
	public String getEmail() {

	return email;

	}
    //sets the value of email(sbasish)
	public void setEmail(String email) {

		this.email = email;
	}
	//return the value of variable mobile(sibasish)
	public long getMobile() {
		return mobile;
	}
	//sets the value of variable mobile(sibasish)
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}

