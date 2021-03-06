package com.ai.yk.common.service.atom.sysconfig.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.yk.common.dao.mapper.bo.SysConfig;
import com.ai.yk.common.dao.mapper.bo.SysConfigCriteria;
import com.ai.yk.common.dao.mapper.factory.MapperFactory;
import com.ai.yk.common.service.atom.sysconfig.ISysConfigAtomSV;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午5:19:10 
 * @version V1.0
 */
@Service
public class SysConfigAtomSVimpl implements ISysConfigAtomSV{

	@Override
	public SysConfig selectOne() {
		SysConfigCriteria example = new SysConfigCriteria();
		List<SysConfig> confs = MapperFactory.getSysConfigMapper().selectByExample(example);
		if(CollectionUtil.isEmpty(confs)){
			return null;
		}
		return confs.get(0);
	}

}
