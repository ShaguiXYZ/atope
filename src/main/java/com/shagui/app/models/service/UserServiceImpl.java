/**
 * 
 */
package com.shagui.app.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shagui.app.models.dao.IUserDao;
import com.shagui.app.models.entity.User;

/**
 * @author Grego
 *
 */
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;
	
	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IUserService#findAll()
	 */
	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return (List<User>)userDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public User findOne(Integer id) {
		Optional<User> user = userDao.findById(id);
		return user.get();
	}

	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IUserService#findOne(java.lang.String)
	 */
	@Override
	public User findOne(String uid) {
		return userDao.findOne(uid);
	}

	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IUserService#save(com.shagui.app.models.entity.User)
	 */
	@Override
	@Transactional
	public void save(User user) {
		userDao.save(user);
	}

	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IUserService#delete(java.lang.Integer)
	 */
	@Override
	@Transactional
	public void delete(Integer id) {
		userDao.delete(findOne(id));
	}

}
