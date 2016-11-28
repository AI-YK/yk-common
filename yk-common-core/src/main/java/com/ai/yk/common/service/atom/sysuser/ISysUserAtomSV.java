package com.ai.yc.common.service.atom.sysuser;

import java.util.List;

import com.ai.yc.common.dao.mapper.bo.SysUser;

public interface ISysUserAtomSV {
	SysUser queryUser(SysUser user);

	String queryUserTheme(String id,String tenantId);
	
	List<SysUser> selectSysUserByOfficeId( String tenantId,String officeId);
}
