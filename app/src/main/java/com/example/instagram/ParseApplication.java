package com.example.instagram;

import android.app.Application;

import com.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("87X3G8tDlQLn8JxSfPtZ9da5XpohA76RqWwYOWD1")
                .clientKey("mrLEJU8dBv9yZG0BhhdG6Bssr8ihumFtZpiKhKXD")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
