package com.ai.yc.common.api.waitjobs.param;

import com.ai.opt.base.vo.BaseInfo;

public class WaitjobsCompleteRequset extends BaseInfo{

	private static final long serialVersionUID = 1L;
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
