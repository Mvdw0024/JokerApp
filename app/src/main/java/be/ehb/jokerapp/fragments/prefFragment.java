package be.ehb.jokerapp.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import be.ehb.jokerapp.R;

public class prefFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences);

    }
}
