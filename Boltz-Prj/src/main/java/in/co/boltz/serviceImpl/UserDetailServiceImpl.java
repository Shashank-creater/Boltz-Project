package in.co.boltz.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.boltz.entity.UserDetail;
import in.co.boltz.repository.UserDetailRepository;
import in.co.boltz.service.UserDetailService;

@Service
public class UserDetailServiceImpl implements UserDetailService
{
	@Autowired
	private UserDetailRepository userDetailRepository;
	
	@Override
	public void saveUser(UserDetail userDetail)
	{
		userDetail.setCreatedDate(new Date());
		userDetail.setCreatedBy(new Long("10000"));
		userDetail.setIsActive("Y");
		userDetailRepository.save(userDetail);
	}

}
