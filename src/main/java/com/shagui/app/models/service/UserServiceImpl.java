/**
 * 
 */
package com.shagui.app.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shagui.app.models.dao.IUsuarioDao;
import com.shagui.app.models.entity.Usuario;

/**
 * @author Grego
 *
 */
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUsuarioDao userDao;
	
	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IUserService#findAll()
	 */
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>)userDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findOne(Long id) {
		Optional<Usuario> user = userDao.findById(id);
		return user.get();
	}

	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IUserService#findOne(java.lang.String)
	 */
	@Override
	public Usuario findOne(String uid) {
		return userDao.findByUsername(uid);
	}

	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IUserService#save(com.shagui.app.models.entity.User)
	 */
	@Override
	@Transactional
	public void save(Usuario user) {
		userDao.save(user);
	}

	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IUserService#delete(java.lang.Integer)
	 */
	@Override
	@Transactional
	public void delete(Long id) {
		userDao.delete(findOne(id));
	}

}
