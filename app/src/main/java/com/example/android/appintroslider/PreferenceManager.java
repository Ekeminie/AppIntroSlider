package com.example.android.appintroslider;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Delight on 16/07/2018.
 */

public class PreferenceManager {

    /**
     * Instantiate an object of Shared Preferences
     */
    SharedPreferences pref;

    /**
     * Object of SharedPreferences  Editor
     */
    SharedPreferences.Editor editor;

    /**
     * constant of the context of the class
     */
    Context context;

    /**
     * Shared Preferences Mode
     */
    int PRIVATE_MODE = 0;

    //Shared Preferences Filename
    private static final String PREF_NAME = "eshietmike_welcome";

    private static final String IS_FIRST_TIME_LAUNCHED = "isfirsttimelaunched";

    public PreferenceManager(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCHED, isFirstTime);
        editor.commit();

    }
    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCHED, true);
    }

}
