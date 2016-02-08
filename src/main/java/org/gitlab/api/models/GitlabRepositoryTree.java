package org.gitlab.api.models;

import java.io.Serializable;

public class GitlabRepositoryTree implements Serializable {
	private static final long serialVersionUID = -8551482689431928827L;

	public static String URL = "/tree";

	private String name;
	private String type;
	private String mode;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
