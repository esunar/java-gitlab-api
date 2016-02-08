package org.gitlab.api.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabRelease implements Serializable {
	private static final long serialVersionUID = 7449430922566761869L;

	@JsonProperty("tag_name")
    private String tagName;

    @JsonProperty("description")
    private String description;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
