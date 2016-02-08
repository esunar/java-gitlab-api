package org.gitlab.api.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabBranch implements Serializable {
	private static final long serialVersionUID = -6804831939616265893L;

	public final static String URL = "/repository/branches/";

    @JsonProperty("name")
    private String name;

    @JsonProperty("commit")
    private GitlabBranchCommit commit;

    @JsonProperty("protected")
    private boolean branchProtected;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GitlabBranchCommit getCommit() {
        return commit;
    }

    public void setCommit(GitlabBranchCommit commit) {
        this.commit = commit;
    }

    public boolean isProtected() {
        return branchProtected;
    }

    public void setProtected(boolean isProtected) {
        this.branchProtected = isProtected;
    }
}
