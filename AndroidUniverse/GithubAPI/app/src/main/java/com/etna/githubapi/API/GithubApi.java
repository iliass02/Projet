package com.etna.githubapi.API;

import com.etna.githubapi.model.GithubUserModel;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;


/**
 * Created by iliass on 25/04/16.
 */
public interface GithubApi {

    @GET("/users")
    void getUsers(Callback<List<GithubUserModel>> callback);

    @GET("/users/{user}/repos")
    void getRepos(@Path("user") String user, Callback<List<GithubUserModel>> callback);

}