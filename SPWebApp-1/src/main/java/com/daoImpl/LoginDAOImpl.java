package com.daoImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dao.LoginDAO;
import com.entity.UserInfo;

@Repository
@Transactional
public class LoginDAOImpl implements LoginDAO
{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void insert(UserInfo userInfo) 
	{
		hibernateTemplate.save(userInfo);
	}

}
