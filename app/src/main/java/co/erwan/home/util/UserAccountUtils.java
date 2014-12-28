package co.erwan.home.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by erwanmartin on 28/12/2014.
 */
public class UserAccountUtils {

    private static final String PREF_PLUS_PROFILE_ID = "plus_profile_id";
    private static final String PREF_PLUS_PROFILE_NAME = "plus_profile_name";
    private static final String PREF_PLUS_IMAGE_URL = "plus_profile_image_url";

    public static void setPlusProfileId(Context context, String profileId){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        sp.edit().putString(PREF_PLUS_PROFILE_ID, profileId).commit();
    }

    public static String getPlusProfileId(Context context){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getString(PREF_PLUS_PROFILE_ID, "");
    }

    public static void setPlusProfileName(Context context, String profileName){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        sp.edit().putString(PREF_PLUS_PROFILE_NAME, profileName).commit();
    }

    public static String getPlusProfileName(Context context){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getString(PREF_PLUS_PROFILE_NAME, "");
    }

    public static void setPlusProfileUrl(Context context, String profileUrl){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        sp.edit().putString(PREF_PLUS_IMAGE_URL, profileUrl).commit();
    }

    public static String getPlusProfileUrl(Context context){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getString(PREF_PLUS_IMAGE_URL, "");
    }
}
