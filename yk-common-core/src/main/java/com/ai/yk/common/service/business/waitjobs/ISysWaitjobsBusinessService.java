package com.ai.yk.common.service.business.waitjobs;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.yk.common.api.waitjobs.param.WaitjobsCompleteRequset;
import com.ai.yk.common.api.waitjobs.param.WaitjobsInsertRequest;
import com.ai.yk.common.api.waitjobs.param.WaitjobsInsertResponse;

public interface ISysWaitjobsBusinessService {
	
	public WaitjobsInsertResponse insertWaitjobs(WaitjobsInsertRequest insertRequest);
	
	public BaseResponse completeWaitjobs(WaitjobsCompleteRequset completeRequest);

}
