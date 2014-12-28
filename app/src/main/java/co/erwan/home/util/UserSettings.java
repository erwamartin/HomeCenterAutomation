package co.erwan.home.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by erwanmartin on 27/12/2014.
 */
public class UserSettings {

    public static void acceptTerms(final Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        sp.edit().putBoolean("accepted_terms", true).commit();
    }

    public static boolean isTermsAccepted(final Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getBoolean("accepted_terms", false);
    }
}
