/**   
 * Copyright  2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * ����������
 * @Package: com.xwj.jdbctemplate 
 * @author: ASUS   
 * @date: 15 Jul 2020 3:24:37 pm 
 */
package com.xwj.jdbctemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xwj.bean.User;
import com.xwj.dao.UserDao;

public class UserDaoImpl implements UserDao{
	//
	JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
	

	/** 
	* @see com.xwj.dao.UserDao#findAllUser()  
	* @Function: UserDaoImpl.java
	* @Description: �ú����Ĺ�������
	*
	* @param:����1����
	* @return�����ؽ������
	* @throws���쳣����
	*
	* @version: v1.0.0
	* @author: ASUS
	* @date: 15 Jul 2020 3:25:41 pm 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 15 Jul 2020     ASUS           v1.0.0               �޸�ԭ��
	*/
	@Override
	public List<User> findAllUser() {
		String sql = "select * from person";
		List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
		return list;
	}

}
