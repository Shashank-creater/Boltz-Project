/*package in.co.boltz.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.boltz.dao.UserDetailDao;
import in.co.boltz.entity.UserDetail;

@Repository
@Transactional
public class UserDetailDaoImpl implements UserDetailDao
{
	private SessionFactory sesionFactory;
	
	@Autowired
	public void setSesionFactory(SessionFactory sesionFactory) {
		this.sesionFactory = sesionFactory;
	}

	@Override
	public void saveUser(UserDetail userDetail)
	{
 		Session session = sesionFactory.getCurrentSession();
 		session.save(userDetail);
	}

	@Override
	public List loginUser(String userName, String password) 
	{
		List resultList 		 = null;
		StringBuffer queryString = null;
		Query query 			 = null;
		Session session 		 = null;
		
		session 	= sesionFactory.getCurrentSession();
		queryString = new StringBuffer();
		
		queryString.append(" select userdetail.userName,userdetail.emailId from UserDetail userdetail ");
		queryString.append(" where userdetail.emailId=:uname and userdetail.password=:password  and userdetail.isActive='Y' ");
		
		query = session.createQuery(queryString.toString());
		query.setParameter("uname",userName);
		query.setParameter("password", password);
		
		resultList = query.list();
		
		 return resultList;
	
	return null;	
	}
 
}
*/