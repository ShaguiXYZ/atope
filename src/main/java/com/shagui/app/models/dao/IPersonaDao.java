/**
 * 
 */
package com.shagui.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.shagui.app.models.entity.Persona;

/**
 * @author gromera
 *
 */
public interface IPersonaDao extends CrudRepository<Persona, Long> {
//	@Query(value="select persona From Persona persona Where persona.uid = ?1")
//	public Persona findByUID(Long uid);
}
