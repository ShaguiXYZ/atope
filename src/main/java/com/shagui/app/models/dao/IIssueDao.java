/**
 * 
 */
package com.shagui.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.shagui.app.models.entity.Issue;
import com.shagui.app.models.entity.Persona;

/**
 * @author gromera
 *
 */
public interface IIssueDao extends CrudRepository<Persona, Long> {
	@Query("selecy * from Issue issue where issue.assignedTo = ?1")
	public List<Issue> findAssigned(Long persona);
}
