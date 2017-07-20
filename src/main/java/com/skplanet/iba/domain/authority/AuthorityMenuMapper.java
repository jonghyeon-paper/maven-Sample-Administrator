package com.skplanet.iba.domain.authority;

import java.util.List;

public interface AuthorityMenuMapper {

	List<AuthorityMenu> selectList(AuthorityMenu authorityMenu);
	List<AuthorityMenu> selectListByAuthorityIds(String... authorityIds);
	AuthorityMenu selectOne(AuthorityMenu authorityMenu);
	int insert(AuthorityMenu authorityMenu);
	int delete(AuthorityMenu authorityMenu);
}
