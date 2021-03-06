package com.ai.yk.common.service.business.sysuser;

import com.ai.yk.common.api.sysuser.param.SysUserListQueryRequest;
import com.ai.yk.common.api.sysuser.param.SysUserListQueryResponse;
import com.ai.yk.common.api.sysuser.param.SysUserQueryRequest;
import com.ai.yk.common.api.sysuser.param.SysUserQueryResponse;
import com.ai.yk.common.api.sysuser.param.SysUserThemeRequest;
import com.ai.yk.common.api.sysuser.param.SysUserThemeResponse;


public interface ISysUserBusiSV {
	
	SysUserQueryResponse queryUser(SysUserQueryRequest request);
	
	
	SysUserThemeResponse queryUserTheme(SysUserThemeRequest requst);
	
	SysUserListQueryResponse queryUserByOfficeId(SysUserListQueryRequest request);
}
