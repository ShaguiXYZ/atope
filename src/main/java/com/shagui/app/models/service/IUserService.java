/**
 * 
 */
package com.shagui.app.models.service;

import java.util.List;

import com.shagui.app.models.entity.Usuario;

/**
 * @author Grego
 *
 */
public interface IUserService {
	public List<Usuario> findAll();
	public Usuario findOne(Long id);
	public Usuario findOne(String uid);
	public void save(Usuario user);
	public void delete(Long id);
}
