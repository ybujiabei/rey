/**   
 * Copyright  2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * ����������
 * @Package: com.xwj.jdbctemplate 
 * @author: ASUS   
 * @date: 15 Jul 2020 3:08:25 pm 
 */
package com.xwj.dao;

import java.util.List;

import com.xwj.bean.User;


/**
 * <p>Description:UserDao.java</p >
 * @author ָ��������
 * @version v1
 * @date 15 Jul 2020 3:08:25 pm
 */
/**   
* Copyright: Copyright (c) 2020 LanRu-Caifu
* 
* @ClassName: UserDao.java
* @Description: ����Ĺ�������
*
* @version: v1.0.0
* @author: ASUS
* @date: 15 Jul 2020 3:08:25 pm 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 15 Jul 2020     ASUS           v1.0.0               �޸�ԭ��
*/
public interface UserDao {
	List<User>findAllUser();
	

}
