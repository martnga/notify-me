package com.nganga.talkie;

import android.app.Application;

import com.parse.Parse;
import com.parse.PushService;

/**
 * Created by nganga on 7/28/15.
 */
public class ChatApp  extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "6nHlBQV1wqF6m4jH38t1ZmRI910llj9z18rgCg9A", "7bwd6qeStdZBsYoqGPTGQLGzDQbB4jW0DLPc0rDS");
        PushService.setDefaultPushCallback(this,MainActivity.class);
    }
}
