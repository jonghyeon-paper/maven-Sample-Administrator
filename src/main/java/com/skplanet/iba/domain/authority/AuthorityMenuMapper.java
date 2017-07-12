package com.skplanet.iba.domain.authority;

import java.util.List;

public interface AuthorityMenuMapper {

	List<AuthorityMenu> selectList(AuthorityMenu authorityMenu);
	AuthorityMenu selectOne(AuthorityMenu authorityMenu);
	int insert(List<AuthorityMenu> authorityMenuList);
	int delete(AuthorityMenu authorityMenu);
}