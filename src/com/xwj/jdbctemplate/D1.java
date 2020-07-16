package com.xwj.jdbctemplate;
import java.util.List;

import com.xwj.bean.User;
import com.xwj.dao.UserDao;
public class D1 {
	

	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		List<User> list = ud.findAllUser();
		
		for (User user : list) {
			System.out.println(user);
			
		}
		
		
		
	}
	

}
