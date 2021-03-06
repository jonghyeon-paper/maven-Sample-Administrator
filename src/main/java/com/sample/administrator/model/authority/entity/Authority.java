package com.sample.administrator.model.authority.entity;

import java.util.List;

import com.sample.administrator.web.element.UseState;

public class Authority {

	private String authorityId;
	private String authorityName;
	private String description;
	private UseState useState;
	
	private List<AuthorityMenu> authorityMenuList;
	private List<AuthorityAccess> authorityAccessList;
	
	public String getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}
	public String getAuthorityName() {
		return authorityName;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public UseState getUseState() {
		return useState;
	}
	public void setUseState(UseState useState) {
		this.useState = useState;
	}
	public List<AuthorityMenu> getAuthorityMenuList() {
		return authorityMenuList;
	}
	public void setAuthorityMenuList(List<AuthorityMenu> authorityMenuList) {
		this.authorityMenuList = authorityMenuList;
	}
	public List<AuthorityAccess> getAuthorityAccessList() {
		return authorityAccessList;
	}
	public void setAuthorityAccessList(List<AuthorityAccess> authorityAccessList) {
		this.authorityAccessList = authorityAccessList;
	}
	
}
