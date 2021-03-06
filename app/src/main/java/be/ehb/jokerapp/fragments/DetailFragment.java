package be.ehb.jokerapp.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import be.ehb.jokerapp.R;
import be.ehb.jokerapp.model.Joke;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView punchlineTV = rootview.findViewById(R.id.tv_details_punchline);
        TextView setupTV = rootview.findViewById(R.id.tv_details_setup);
        Bundle data = getArguments();
        if (data != null) {
            if (data.containsKey("passedJoke")) {
                Joke joke = (Joke) data.getSerializable("passedJoke");
                setupTV.setText(joke.getSetup());
                punchlineTV.setText(joke.getPunchline());
            }
        }


        return rootview;
    }

}
