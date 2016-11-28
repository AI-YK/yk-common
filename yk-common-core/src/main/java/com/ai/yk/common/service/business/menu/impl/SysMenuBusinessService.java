package com.ai.yk.common.service.business.menu.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.paas.ipaas.util.JSonUtil;
import com.ai.yk.common.api.menu.param.SysMenuListQueryRequest;
import com.ai.yk.common.api.menu.param.SysMenuListQueryResponse;
import com.ai.yk.common.api.office.param.OfficeChildrenListQueryResponse;
import com.ai.yk.common.api.office.param.OfficeVO;
import com.ai.yk.common.constants.ResultCodeConstants;
import com.ai.yk.common.dao.mapper.bo.SysMenu;
import com.ai.yk.common.dao.mapper.bo.SysOffice;
import com.ai.yk.common.service.atom.menu.ISysMenuAtomService;
import com.ai.yk.common.service.business.menu.ISysMenuBusinessService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service
@Transactional
public class SysMenuBusinessService implements ISysMenuBusinessService{

	@Autowired
	private ISysMenuAtomService iSysMenuAtomService;
	
	@Override
	public SysMenuListQueryResponse queryMenuByUserId(SysMenuListQueryRequest request) {
		List<SysMenu> menuList =iSysMenuAtomService.findByUserId(request.getUserId());
		SysMenuListQueryResponse queryResponse = new SysMenuListQueryResponse();
		if(!CollectionUtil.isEmpty(menuList)){
			List<String> hrefList =new ArrayList<String>();
			for(SysMenu menu:menuList){
				if(menu.getHref() !=null && !menu.getHref().isEmpty())
					hrefList.add(menu.getHref());
			}
			queryResponse.setMenuList(hrefList);
			ResponseHeader responseHeader = new ResponseHeader(true,
					ResultCodeConstants.SUCCESS_CODE, "查询成功");
			queryResponse.setResponseHeader(responseHeader);
		} else {
			ResponseHeader responseHeader = new ResponseHeader(true,
					ResultCodeConstants.NULL_CODE, "无数据");
			queryResponse.setResponseHeader(responseHeader);
		}
		return queryResponse;
	
	}

}
