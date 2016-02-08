package org.gitlab.api.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabPermission implements Serializable {
	private static final long serialVersionUID = -1086224979224469896L;

	@JsonProperty("project_access")
    private GitlabProjectAccessLevel projectAccess;

    @JsonProperty("group_access")
    private GitlabProjectAccessLevel groupAccess;

    public GitlabProjectAccessLevel getProjectAccess() {
        return projectAccess;
    }

    public GitlabProjectAccessLevel getProjectGroupAccess() {
        return groupAccess;
    }
}
