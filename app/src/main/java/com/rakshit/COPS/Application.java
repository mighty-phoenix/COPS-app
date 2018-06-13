package com.rakshit.COPS;

import com.rakshit.COPS.managers.DatabaseHelper;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
public class Application extends android.app.Application {

    public static final String TAG = Application.class.getSimpleName();



    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        ApplicationHelper.initDatabaseHelper(this);
        DatabaseHelper.getInstance(this).subscribeToNewPosts();
    }
}
