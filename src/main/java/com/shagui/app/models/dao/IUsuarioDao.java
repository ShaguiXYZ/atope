package com.shagui.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.shagui.app.models.entity.Usuario;

/**
 * @author Grego
 *
 */
public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	public Usuario findByUsername(String username);
}
