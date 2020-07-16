/**   
 * Copyright  2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.xwj.jdbctemplate 
 * @author: ASUS   
 * @date: 15 Jul 2020 3:08:25 pm 
 */
package com.xwj.dao;

import java.util.List;

import com.xwj.bean.User;


/**
 * <p>Description:UserDao.java</p >
 * @author 指定的作者
 * @version v1
 * @date 15 Jul 2020 3:08:25 pm
 */
/**   
* Copyright: Copyright (c) 2020 LanRu-Caifu
* 
* @ClassName: UserDao.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: ASUS
* @date: 15 Jul 2020 3:08:25 pm 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 15 Jul 2020     ASUS           v1.0.0               修改原因
*/
public interface UserDao {
	List<User>findAllUser();
	

}
