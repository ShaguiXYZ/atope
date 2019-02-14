/**
 * 
 */
package com.shagui.app.models.service;

import java.util.List;

import com.shagui.app.models.entity.User;

/**
 * @author Grego
 *
 */
public interface IUserService {
	public List<User> findAll();
	public User findOne(Integer id);
	public User findOne(String uid);
	public void save(User user);
	public void delete(Integer id);
}
