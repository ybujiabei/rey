package com.xwj.jdbctemplate;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xwj.bean.User;
import com.xwj.dao.UserDao;
public class D2 {
	public static void main(String[] args) {
		//findAllUser();
		

		//addUser();

		
		
	    //updateUser();
		 //deleteUser();
		//deleteUsername();
		findUserById();
	}
	
	
	private static void findUserById() {
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		List<User> list = jt.query("select * from person where id = ? ",new BeanPropertyRowMapper(User.class),70);
		User user = list.get(0);
		System.out.println(user);
		
	}
	
	
	private static void deleteUsername() {
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		int update = jt.update("delete from person where name = ? ","��һ��");
		System.out.println(update);
	}
	
	private static void deleteUser() {
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		int update = jt.update("delete from person where id = ? ",73);
		System.out.println(update);
	}

	
	
	private static void updateUser() {
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		int update = jt.update("update person set name = ?,password = ?,username = ?,age = ?,descn = ?,height = ?  where id = ? ","������",123,"ϲϲ",20,"����",168,73);
	    System.out.println(update);
	}

	
	
	/**   
	* @Function: D2.java
	* @Description: �ú����Ĺ�������
	*
	* @param:����1����
	* @return�����ؽ������
	* @throws���쳣����
	*
	* @version: v1.0.0
	* @author: ASUS
	* @date: 15 Jul 2020 4:50:50 pm 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 15 Jul 2020     ASUS           v1.0.0               �޸�ԭ��
	*/
	private static void addUser() {
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = " insert into person(name,password,descn,username,age,height) values ('������',7777,'����','ͬѧ',20,169),('��һ��',888,'����','ͬѧ',20,179),('������',999,'����','ͬѧ',20,186)";
		
    int update = jt.update(sql);
	    System.out.println(update);
	}
	

	
	
	
	/**   
	* @Function: D2.java
	* @Description: �ú����Ĺ�������
	*
	* @param:����1����
	* @return�����ؽ������
	* @throws���쳣����
	*
	* @version: v1.0.0
	* @author: ASUS
	* @date: 15 Jul 2020 4:40:02 pm 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 15 Jul 2020     ASUS           v1.0.0               �޸�ԭ��
	*/
	private static void findAllUser() {
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "select * from person";
		
		List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
		
	  for (User user : list) {
		  System.out.println(user);
		
	}
	}
	

}
