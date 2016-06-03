package com.etna.githubapi.model;

/**
 * Created by iliass on 26/04/16.
 */
public class GithubUserModel {
    private String login;
    private String name;
    private String description;
    private String html_url;
    private String created_at;
    private String updated_at;
    private String language;

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }


}
