package com.ai.yk.common.api.sysconfig.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yk.common.api.sysconfig.param.CommissionConfig;
import com.ai.yk.common.api.sysconfig.param.DonateIntegralConfig;
import com.ai.yk.common.api.sysconfig.param.HomeDataEidtConfig;
import com.ai.yk.common.api.sysconfig.param.MemberConfig;

/**
 * @Description: 会员基本配置查询服务
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午2:29:36 
 * @version V1.0
 */
@Path("/sysconfig")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysConfigSV {
	
	 /**
     * 获取会员基本配置查询
     * @param 
     * @return 
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0504
     * @RestRelativeURL sysconfig/getMemberConfig
	 */
	@POST
	@Path("/getMemberConfig")
	MemberConfig getMemberConfig()throws BusinessException,SystemException;
	
	 /**
     * 获取平台佣金比例配置查询
     * @param 
     * @return 
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0505
     * @RestRelativeURL sysconfig/getCommissionConfig
	 */
	@POST
	@Path("/getCommissionConfig")
	CommissionConfig getCommissionConfig()throws BusinessException,SystemException;
	
	 /**
     * 获取首页数据编辑配置查询
     * @param 
     * @return 
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0506
     * @RestRelativeURL sysconfig/getHomeDataEidtConfig
	 */
	@POST
	@Path("/getHomeDataEidtConfig")
	HomeDataEidtConfig getHomeDataEidtConfig()throws BusinessException,SystemException;
	
	 /**
     * 获取赠送积分配置查询
     * @param 
     * @return 
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0507
     * @RestRelativeURL sysconfig/getDonateIntegralConfig
	 */
	@POST
	@Path("/getDonateIntegralConfig")
	DonateIntegralConfig getDonateIntegralConfig()throws BusinessException,SystemException;

}
