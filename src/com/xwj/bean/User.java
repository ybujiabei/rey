/**   
 * Copyright  2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.xwj.jdbctemplate 
 * @author: ASUS   
 * @date: 15 Jul 2020 3:11:24 pm 
 */
package com.xwj.bean;
/**
 * <p>Description:User.java</p >
 * @author 指定的作者
 * @version v1
 * @date 15 Jul 2020 3:11:24 pm
 */
/**   
* Copyright: Copyright (c) 2020 LanRu-Caifu
* 
* @ClassName: User.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: ASUS
* @date: 15 Jul 2020 3:11:24 pm 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 15 Jul 2020     ASUS           v1.0.0               修改原因
*/
public class User {
	private Integer id;
	private String name;
	private Integer password;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public Integer getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(Integer password) {
		this.password = password;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	private String username;
	private Integer age;
	private String desc;
	private Double height;
	/** 
	* @see java.lang.Object#toString()  
	* @Function: User.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: ASUS
	* @date: 15 Jul 2020 3:44:46 pm 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 15 Jul 2020     ASUS           v1.0.0               修改原因
	*/
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", username=" + username + ", age="
				+ age + ", desc=" + desc + ", height=" + height + "]";
	}
    
	
	

}
