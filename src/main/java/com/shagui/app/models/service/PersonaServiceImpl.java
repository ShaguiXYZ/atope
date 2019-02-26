/**
 * 
 */
package com.shagui.app.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shagui.app.models.dao.IPersonaDao;
import com.shagui.app.models.entity.Persona;

/**
 * @author Grego
 *
 */
@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaDao personaDao;
	
	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IPersonaService#findAll()
	 */
	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return (List<Persona>)personaDao.findAll();
	}

	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IPersonaService#findOne(java.lang.Long)
	 */
	@Override
	@Transactional(readOnly = true)
	public Persona findOne(Long id) {
		Optional<Persona> user = personaDao.findById(id);
		return user.get();
	}

	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IPersonaService#save(com.shagui.app.models.entity.Persona)
	 */
	@Override
	@Transactional
	public void save(Persona persona) {
		personaDao.save(persona);
	}

	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IPersonaService#delete(java.lang.Long)
	 */
	@Override
	@Transactional
	public void delete(Long id) {
		personaDao.delete(findOne(id));
	}

}
