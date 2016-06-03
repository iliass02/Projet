package com.etna.githubapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.etna.githubapi.API.GithubApi;
import com.etna.githubapi.model.GithubUserModel;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.android.AndroidLog;
import retrofit.client.Response;

/**
 * Created by cherif on 28/04/2016.
 */
public class RepoDetail extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {

        Bundle extras = getIntent().getExtras();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.repo_detail);

        TextView txtRepo = (TextView)findViewById(R.id.txtRepo);
        TextView txtDesc = (TextView)findViewById(R.id.txtDesc);
        TextView txtUpdate = (TextView)findViewById(R.id.txtUpdate);
        TextView txtCreated = (TextView)findViewById(R.id.txtCreated);
        TextView txtLanguage = (TextView)findViewById(R.id.txtLanguage);
        TextView txtUrl = (TextView)findViewById(R.id.txtUrl);
        txtRepo.setText(extras.getString("Repos"));
        txtDesc.setText("Description: "+extras.getString("Description"));
        txtUpdate.setText("Dernière mise a jour: "+extras.getString("UpdateAt"));
        txtCreated.setText("Date de Création: "+extras.getString("CreatedAt"));
        txtLanguage.setText("Language: "+extras.getString("Language"));
        txtUrl.setText("Accès au Github: "+extras.getString("HtmlUrl"));


    }
}
