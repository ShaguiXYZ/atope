/**
 * 
 */
package com.shagui.app.models.service;

import java.util.List;

import com.shagui.app.models.entity.Persona;

/**
 * @author Grego
 *
 */
public interface IPersonaService {
	public List<Persona> findAll();
	public Persona findOne(Long id);
	public void save(Persona persona);
	public void delete(Long id);
}
