package com.etna.githubapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
 * Created by iliass on 27/04/16.
 */
public class ListRepoGithub extends AppCompatActivity {

    private ListView lvRepos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.repo_github);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("Users");
        }

        lvRepos = (ListView) findViewById(R.id.lvRepos);

        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("https://api.github.com/").setLog(new AndroidLog("retrofit"))
                .setLogLevel(RestAdapter.LogLevel.FULL).build();
        GithubApi GithubApi = restAdapter.create(GithubApi.class);

        GithubApi.getRepos(extras.getString("Users"), new Callback<List<GithubUserModel>>() {
            @Override
            public void success(List<GithubUserModel> githubUserModels, Response response) {

                AdapterGithubRepos adapter = new AdapterGithubRepos(ListRepoGithub.this, githubUserModels);
                lvRepos.setAdapter(adapter);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });


    }


    private class AdapterGithubRepos extends ArrayAdapter<GithubUserModel> {
        private List<GithubUserModel> listGithubRepos;

        public AdapterGithubRepos(Context context, List<GithubUserModel> list) {
            super(context, R.layout.listitem_githubrepo, list);
            listGithubRepos = list;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());

            View item = inflater.inflate(R.layout.listitem_githubrepo, null);

            TextView txtName = (TextView)item.findViewById(R.id.txtRepo);
            TextView txtDesc = (TextView)item.findViewById(R.id.txtDesc);
            txtName.setText(listGithubRepos.get(position).getName());
            txtDesc.setText(listGithubRepos.get(position).getDescription());

            //click in item
            lvRepos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                    String yourData = listGithubRepos.get(position).getName();
                    String description = listGithubRepos.get(position).getDescription();
                    String html_url = listGithubRepos.get(position).getHtml_url();
                    String created_at = listGithubRepos.get(position).getCreated_at();
                    String updated_at = listGithubRepos.get(position).getUpdated_at();
                    String language = listGithubRepos.get(position).getLanguage();
                    Intent intent = new Intent(getContext(), RepoDetail.class);
                    intent.putExtra("Repos", yourData);
                    intent.putExtra("Description",description);
                    intent.putExtra("CreatedAt",created_at);
                    intent.putExtra("UpdateAt",updated_at);
                    intent.putExtra("Language",language);
                    intent.putExtra("HtmlUrl",html_url);
                    getContext().startActivity(intent);

                    System.out.println(updated_at);
                }
            });

            return item;

        }
    }
}