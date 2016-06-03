package com.etna.githubapi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.etna.githubapi.API.GithubApi;
import com.etna.githubapi.model.GithubUserModel;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.android.AndroidLog;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    private ListView lvUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvUsers = (ListView) findViewById(R.id.lvUsers);

        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("https://api.github.com/").setLog(new AndroidLog("retrofit"))
                .setLogLevel(RestAdapter.LogLevel.FULL).build();
        GithubApi GithubApi = restAdapter.create(GithubApi.class);
        GithubApi.getUsers(new Callback<List<GithubUserModel>>() {
            @Override
            public void success(List<GithubUserModel> githubUserModels, Response response) {

                AdapterGithubUsers adapter = new AdapterGithubUsers(MainActivity.this, githubUserModels);
                lvUsers.setAdapter(adapter);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });

    }


    private class AdapterGithubUsers extends ArrayAdapter<GithubUserModel> {
        private List<GithubUserModel> listGithubUsers;

        public AdapterGithubUsers(Context context, List<GithubUserModel> list) {
            super(context, R.layout.listitem_githubuser, list);
            listGithubUsers = list;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());

            View item = inflater.inflate(R.layout.listitem_githubuser, null);

            TextView txtName = (TextView)item.findViewById(R.id.txtUser);
            txtName.setText(listGithubUsers.get(position).getLogin());

            //click in item
            lvUsers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                    String yourData = listGithubUsers.get(position).getLogin();
                    System.out.println(yourData);
                    Intent intent = new Intent(getContext(), ListRepoGithub.class);
                    intent.putExtra("Users", yourData);
                    getContext().startActivity(intent);
                }
            });

            return item;
        }
    }
}
