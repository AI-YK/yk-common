package com.ai.yk.common.api.sysdomain.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * @Description: 领域列表返回参数
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午4:44:04 
 * @version V1.0
 */
public class QuerySysDomainListRes extends BaseResponse{

	private static final long serialVersionUID = 6231729312457654148L;
	
	private List<SysDomainVo> domainVos;

	public List<SysDomainVo> getDomainVos() {
		return domainVos;
	}

	public void setDomainVos(List<SysDomainVo> domainVos) {
		this.domainVos = domainVos;
	}

	

}
