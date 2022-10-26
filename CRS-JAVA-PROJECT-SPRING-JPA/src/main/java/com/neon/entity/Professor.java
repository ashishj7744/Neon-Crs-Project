/**
 * 
 */
package com.neon.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author user363
 *
 */
@Entity
@Table(name="Professor")
public class Professor {

	@Id
	private int pId;
	private String pPasword;
	private String pName;
	private String pCity;
	private String pEmail;
	
	public Professor(int pId, String pPasword, String pName, String pCity, String pEmail) {
		super();
		this.pId = pId;
		this.pPasword = pPasword;
		this.pName = pName;
		this.pCity = pCity;
		this.pEmail = pEmail;
	}
	

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpPasword() {
		return pPasword;
	}
	public void setpPasword(String pPasword) {
		this.pPasword = pPasword;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCity() {
		return pCity;
	}
	public void setpCity(String pCity) {
		this.pCity = pCity;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	
	
	
	
	
	
	
}
