package com.ai.yk.common.service.atom.ipaddr;

import com.ai.yk.common.dao.mapper.bo.GnIpAddr;

public interface IIpAddrAtomSV {
	GnIpAddr getIpAddrByIp(String ip);
}
