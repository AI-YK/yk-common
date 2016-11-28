package com.ai.yk.common.service.business.menu;

import com.ai.yk.common.api.menu.param.SysMenuListQueryRequest;
import com.ai.yk.common.api.menu.param.SysMenuListQueryResponse;

public interface ISysMenuBusinessService {
	SysMenuListQueryResponse queryMenuByUserId(SysMenuListQueryRequest request);

}
