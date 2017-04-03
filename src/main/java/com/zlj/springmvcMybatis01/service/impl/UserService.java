package com.zlj.springmvcMybatis01.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.zlj.springmvcMybatis01.dao.IUserDao;
import com.zlj.springmvcMybatis01.entity.UserVO;
import com.zlj.springmvcMybatis01.service.IUserService;

@Service("userService") 
public class UserService implements IUserService {
	private static Logger logger = Logger.getLogger(UserService.class);  
	
	@Resource
	private IUserDao iUserDao;

	@Override
	public UserVO getUserById(UserVO userVO) {
		logger.info(userVO.toString());
		userVO = iUserDao.getUserById(userVO);
		return userVO;
	}

}
