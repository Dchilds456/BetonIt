package com.example.betonit;

import android.app.Application;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("gqkMRVyLQHCtd3ogpIy0jhYFzXoSWpbpBGgKexEd") // should correspond to Application Id env variable
                .clientKey("XmdWiurq3ZXwLfsh54SG1uWrNPBd5qbCZGk2rytm")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());
    }
}