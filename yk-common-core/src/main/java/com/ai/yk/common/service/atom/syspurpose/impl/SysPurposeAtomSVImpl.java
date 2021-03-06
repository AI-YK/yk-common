package com.ai.yk.common.service.atom.syspurpose.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.opt.sdk.util.StringUtil;
import com.ai.yk.common.constants.Constants;
import com.ai.yk.common.dao.mapper.bo.SysPurpose;
import com.ai.yk.common.dao.mapper.bo.SysPurposeCriteria;
import com.ai.yk.common.dao.mapper.factory.MapperFactory;
import com.ai.yk.common.service.atom.syspurpose.ISysPurposeAtomSV;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:36:32 
 * @version V1.0
 */
@Service
public class SysPurposeAtomSVImpl implements ISysPurposeAtomSV{

	/**
	 * 查询页面显示的用途
	 */
	@Override
	public List<SysPurpose> querySysPurposeList(String language) {
		SysPurposeCriteria example = new SysPurposeCriteria();
		SysPurposeCriteria.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(Constants.SysPurpose.STATE_SHOW);
		if(!StringUtil.isBlank(language)){
			criteria.andLanguageEqualTo(language);
		}
		example.setOrderByClause("sort DESC ,updatetime DESC");
		return MapperFactory.getSysPurposeMapper().selectByExample(example);
	}

	@Override
	public SysPurpose selectByPrimaryKey(String purposeId) {
		return MapperFactory.getSysPurposeMapper().selectByPrimaryKey(purposeId);
	}

}
