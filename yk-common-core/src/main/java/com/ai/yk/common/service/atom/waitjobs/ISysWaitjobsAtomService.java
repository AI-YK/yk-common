package com.ai.yk.common.service.atom.waitjobs;

import com.ai.yk.common.dao.mapper.bo.SysWaitjobs;

public interface ISysWaitjobsAtomService {
	
	public String insertWaitjobs(SysWaitjobs waitjobs);
	
	public int completeWaitjobs(String id, String tenantId);
}
