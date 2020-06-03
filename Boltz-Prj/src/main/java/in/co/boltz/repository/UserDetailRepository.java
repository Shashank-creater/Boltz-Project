package in.co.boltz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.boltz.entity.UserDetail;

@Repository
//@Transactional
public interface UserDetailRepository extends CrudRepository<UserDetail, Long>
{
	/*public void saveUser(UserDetail userDetail);
	public List loginUser(String userName,String password);*/
}
