package com.ai.yk.common.cache;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.cache.base.AbstractCache;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.yk.common.api.cachekey.key.CacheKey;
import com.ai.yk.common.constants.CacheNSMapper;
import com.ai.yk.common.dao.mapper.bo.SysDomain;
import com.ai.yk.common.service.atom.sysdomain.ISysDomainAtomSV;
import com.ai.yk.common.util.CacheFactoryUtil;
import com.ai.yk.common.util.PaaSConfUtil;
import com.alibaba.fastjson.JSON;

/**
 * @Description: 写领域到缓存
 * @author hougang@asiainfo.com
 * @date 2016年11月21日 下午3:44:44 
 * @version V1.0
 */
@Component
public class SysDomainCache extends AbstractCache {
	
	@Autowired
	private ISysDomainAtomSV iSysDomainAtomSV;

	@Override
	public void write() throws Exception {
	    List<SysDomain> domains =	iSysDomainAtomSV.querySysDomainList(null);
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_DOMAIN_RULE);
				cacheClientList.add(cacheClient);
			}
		}
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.hset(CacheKey.DOMAIN_L_KEY,CacheKey.DOMAIN_L_KEY,JSON.toJSONString(domains));
		}
		for(SysDomain domain:domains){
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.DOMAIN_D_KEY, domain.getDomainId(),JSON.toJSONString(domain));
			}
		}
	}

}
