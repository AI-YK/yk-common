/**
 * 
 */
package com.ai.yk.common.api.country.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.yk.common.api.country.interfaces.IGnCountrySV;
import com.ai.yk.common.api.country.param.CountryRequest;
import com.ai.yk.common.api.country.param.CountryResponse;
import com.ai.yk.common.api.country.param.CountryVo;
import com.ai.yk.common.constants.ResultCodeConstants;
import com.ai.yk.common.dao.mapper.bo.GnCountry;
import com.ai.yk.common.service.business.country.IGnCountryBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;

/**
 * <br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author xuyw
 */
@Service
@Component
public class GnCountrySVImpl implements IGnCountrySV {
	@Autowired
	IGnCountryBusiSV gnCountryBusiSV;

	@Override
	public CountryResponse queryCountry(CountryRequest request)
			throws BusinessException, SystemException {
		if (request == null) {
			throw new BusinessException(
					ExceptCodeConstants.Special.PARAM_IS_NULL,
					"获取参数失败:请求参数不能为空");
		}
		CountryResponse res = new CountryResponse();
		res.setResponseHeader(new ResponseHeader(true,
				ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		List<GnCountry> list = gnCountryBusiSV.queryCountry(request);
		if (!CollectionUtil.isEmpty(list)) {
			res.setResult(JSON.parseArray(JSON.toJSONString(list),
					CountryVo.class));
		}
		return res;
	}

}
