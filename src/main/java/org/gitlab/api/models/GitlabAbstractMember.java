package org.gitlab.api.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class GitlabAbstractMember extends GitlabUser implements Serializable {
	private static final long serialVersionUID = -5136769858961257014L;

	public static final String URL = "/members";

	@JsonProperty("access_level")
	private int accessLevel;

	public GitlabAccessLevel getAccessLevel() {
		return GitlabAccessLevel.fromAccessValue(accessLevel);
	}

	public void setAccessLevel(GitlabAccessLevel accessLevel) {
		this.accessLevel = accessLevel.accessValue;
	}

}
