package com.example.flowerrecognition;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseInstallation;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.SashiDo_app_id))
                .clientKey(getString(R.string.SashiDo_client_key))
                .server(getString(R.string.SashiDo_server_url))
                .build()
        );
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.saveInBackground();
    }
}