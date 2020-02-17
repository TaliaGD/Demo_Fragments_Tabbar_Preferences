package be.ehb.demo_fragments_tabbar.fragments;

import android.os.Bundle;
import android.provider.CalendarContract;

import androidx.preference.PreferenceFragmentCompat;

import be.ehb.demo_fragments_tabbar.R;

public class PrefFragment extends PreferenceFragmentCompat {

    public static PrefFragment newInstance(){
        return new PrefFragment();
    }




    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}

