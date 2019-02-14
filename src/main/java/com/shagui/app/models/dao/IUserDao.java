package com.shagui.app.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.shagui.app.models.entity.User;

/**
 * @author Grego
 *
 */
public interface IUserDao extends CrudRepository<User, Integer> {
	
	@Query(value = "select user from User user where user.uid = ?1")
	public User findOne(String uid);
}
