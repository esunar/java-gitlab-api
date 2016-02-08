package org.gitlab.api.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabGroup implements Serializable {
	private static final long serialVersionUID = -8058114138768948567L;

	public static final String URL = "/groups";

    private Integer id;
    private String name;
    private String path;

    @JsonProperty("ldap_cn")
    private String ldapCn;

    @JsonProperty("ldap_access")
    private Integer ldapAccess;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLdapCn() {
        return ldapCn;
    }

    public void setLdapCn(String ldapCn) {
        this.ldapCn = ldapCn;
    }

    public GitlabAccessLevel getLdapAccess() {
        return GitlabAccessLevel.fromAccessValue(ldapAccess);
    }

    public void setLdapAccess(GitlabAccessLevel ldapGitlabAccessLevel) {
        this.ldapAccess = ldapGitlabAccessLevel.accessValue;
    }
}
