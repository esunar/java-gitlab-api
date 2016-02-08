package org.gitlab.api.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabSession extends GitlabUser implements Serializable {
	private static final long serialVersionUID = -2026228869630347997L;

	public static final String URL = "/session";

    @JsonProperty("private_token")
    private String privateToken;

    @Override
    public String getPrivateToken() {
        return privateToken;
    }

    @Override
    public void setPrivateToken(String privateToken) {
        this.privateToken = privateToken;
    }

}
