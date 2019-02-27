/**
 * 
 */
package com.shagui.app.models.service;

import java.util.List;

import com.shagui.app.models.entity.Issue;

/**
 * @author gromera
 *
 */
public interface IIssueService {
	public List<Issue> findAssigned(Long persona);
}
