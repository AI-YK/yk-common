package com.ai.yk.common.api.menu.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yk.common.api.menu.interfaces.ISysMenuQuerySV;
import com.ai.yk.common.api.menu.param.SysMenuListQueryRequest;
import com.ai.yk.common.api.menu.param.SysMenuListQueryResponse;
import com.ai.yk.common.service.business.menu.ISysMenuBusinessService;
import com.ai.yk.common.util.SystemValidateUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class SysMenuQueryImpl implements ISysMenuQuerySV {

	@Autowired
	ISysMenuBusinessService iSysMenuBusinessService;

	@Override
	public SysMenuListQueryResponse queryMenuByUserId(SysMenuListQueryRequest request)
			throws BusinessException, SystemException {
		SystemValidateUtil.validateCompleteSysMenu(request);
		return iSysMenuBusinessService.queryMenuByUserId(request);
	}
	
	


}
