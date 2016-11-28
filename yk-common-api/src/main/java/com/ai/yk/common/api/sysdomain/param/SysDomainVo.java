package com.ai.yc.common.api.sysdomain.param;

import java.io.Serializable;

public class SysDomainVo implements Serializable{

	private static final long serialVersionUID = -7191568125734573208L;
	
	/**
	 * 编号
	 */
	private String domainId;

    /**
     * 语言
     */
    private String language;

    /**
     * 站点
     */
    private String site;

    /**
     * 中文名称
     */
    private String domainCn;

    /**
     * 英文名称
     */
    private String domainEn;

    /**
     * 描述
     */
    private String remarks;

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getDomainCn() {
		return domainCn;
	}

	public void setDomainCn(String domainCn) {
		this.domainCn = domainCn;
	}

	public String getDomainEn() {
		return domainEn;
	}

	public void setDomainEn(String domainEn) {
		this.domainEn = domainEn;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    
    


}
