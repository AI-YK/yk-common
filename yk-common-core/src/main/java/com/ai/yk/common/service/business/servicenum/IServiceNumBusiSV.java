package com.ai.yk.common.service.business.servicenum;

import com.ai.yk.common.api.servicenum.param.ServiceNum;

public interface IServiceNumBusiSV {
	ServiceNum getServiceNumByPhone(String phone);
}
