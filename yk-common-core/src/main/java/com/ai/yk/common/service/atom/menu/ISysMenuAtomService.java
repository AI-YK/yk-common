package com.ai.yk.common.service.atom.menu;

import java.util.List;

import com.ai.yk.common.dao.mapper.bo.SysMenu;

public interface ISysMenuAtomService {
	
	 List<SysMenu> findByUserId(String userId);
}
