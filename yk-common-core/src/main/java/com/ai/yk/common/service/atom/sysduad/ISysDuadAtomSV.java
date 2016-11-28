package com.ai.yk.common.service.atom.sysduad;

import java.util.List;

import com.ai.yk.common.dao.mapper.bo.SysDuad;

public interface ISysDuadAtomSV {
	
	/**
	 * 获取页面显示的
	 */
	List<SysDuad> querySysDuadList(String language,String orderType);
	
	SysDuad querySysDuadDetails(String duadId);

}
