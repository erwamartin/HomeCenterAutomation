package co.erwan.home.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by erwanmartin on 27/12/2014.
 */
public class UserSettingsUtils {

    private static final String PREF_ACCEPTED_TERMS = "accepted_terms";

    public static void acceptTerms(final Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        sp.edit().putBoolean(PREF_ACCEPTED_TERMS, true).commit();
    }

    public static boolean isTermsAccepted(final Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getBoolean(PREF_ACCEPTED_TERMS, false);
    }
}
