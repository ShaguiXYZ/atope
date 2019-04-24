/**
 * 
 */
package com.shagui.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shagui.app.models.dao.IIssueDao;
import com.shagui.app.models.entity.Issue;

/**
 * @author Shagui
 *
 */
public class IssueService implements IIssueService {

	@Autowired 
	private IIssueDao issuesDao;
	
	/* (non-Javadoc)
	 * @see com.shagui.app.models.service.IIssueService#findAssigned(java.lang.Long)
	 */
	@Override
	public List<Issue> findAssigned(Long persona) {
		return issuesDao.findAssigned(persona);
	}

}
