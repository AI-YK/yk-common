package com.ai.yk.common.service.business.industry;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yk.common.api.industry.param.IndustryQueryResponse;

public interface IIndustryBusiSV {

    List<IndustryQueryResponse> queryIndustryList() throws BusinessException,SystemException;
    
    
    IndustryQueryResponse queryByIndustryCode(String industryCode)throws BusinessException,SystemException;
}
