package com.wei.swaggle.entity;
 
import java.util.Date;
 
/**
 * @author zh
 * @ClassName cn.saytime.bean.User
 * @Description
 */
public class User {
 
	private Integer id;
	private String username;
	private int age;
	private Date ctm;
 
	// Getter Setter

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCtm() {
		return ctm;
	}

	public void setCtm(Date ctm) {
		this.ctm = ctm;
	}
}
