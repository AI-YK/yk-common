package com.ai.yk.common.cache;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.cache.base.AbstractCache;
import com.ai.yk.common.constants.Constants;
import com.ai.yk.common.dao.mapper.bo.SysDuad;
import com.ai.yk.common.service.atom.sysduad.ISysDuadAtomSV;

/**
 * @Description: 写语言对到缓存
 * @author hougang@asiainfo.com
 * @date 2016年11月21日 下午3:31:21 
 * @version V1.0
 */
@Component
public class SysduadCache extends AbstractCache{
	
   private static final Logger logger = LoggerFactory.getLogger(SysduadCache.class);
	
   @Autowired
   private ISysDuadAtomSV  iSysDuadAtomSV;

	@Override
	public void write() throws Exception {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		List<SysDuad> txtDuads = iSysDuadAtomSV.querySysDuadList(null, Constants.SysDuad.ORDER_TYPE_FAST);	
		List<SysDuad> docDuads = iSysDuadAtomSV.querySysDuadList(null, Constants.SysDuad.ORDER_TYPE_DOC);	
		List<SysDuad> oralDuads = iSysDuadAtomSV.querySysDuadList(null, Constants.SysDuad.ORDER_TYPE_ORAL);
		
		try {
			pool.execute(new SysduadCacheThread(txtDuads,Constants.SysDuad.ORDER_TYPE_FAST));
			pool.execute(new SysduadCacheThread(docDuads,Constants.SysDuad.ORDER_TYPE_DOC));
			pool.execute(new SysduadCacheThread(oralDuads,Constants.SysDuad.ORDER_TYPE_ORAL));
		} catch (Exception e) {
			 logger.info(e.getMessage(),e); 
		}finally{
			if(pool!=null){
	            pool.shutdown(); 
	        }
		}
	}

}
