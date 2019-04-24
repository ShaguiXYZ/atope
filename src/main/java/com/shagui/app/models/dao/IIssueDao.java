/**
 * 
 */
package com.shagui.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.shagui.app.models.entity.Issue;

/**
 * @author Shagui
 *
 */
public interface IIssueDao extends CrudRepository<Issue, Long> {
	@Query("select issue from Issue issue where issue.assignedToId = ?1")
	public List<Issue> findAssigned(Long persona);
}
