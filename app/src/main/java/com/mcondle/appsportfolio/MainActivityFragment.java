package com.mcondle.appsportfolio;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button spotifyStreamerButton = (Button) view.findViewById(R.id.spotify_streamer);
        Button scoresAppButton = (Button) view.findViewById(R.id.scores_app);
        Button libaryAppButton = (Button) view.findViewById(R.id.library_app);
        Button buildItBiggerButton = (Button) view.findViewById(R.id.build_it_bigger);
        Button baconReaderButton = (Button) view.findViewById(R.id.bacon_reader);
        Button capstoneButton = (Button) view.findViewById(R.id.capstone);


        spotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "This button will launch my Spotify Streamer app";
                int duration = Toast.LENGTH_SHORT;

                Toast spotifyStreamerToast = Toast.makeText(context, text, duration);
                spotifyStreamerToast.show();
            }
        });

        scoresAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "This button will launch my Scores app";
                int duration = Toast.LENGTH_SHORT;

                Toast scoresAppToast = Toast.makeText(context, text, duration);
                scoresAppToast.show();
            }
        });

        libaryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "This button will launch my Library app";
                int duration = Toast.LENGTH_SHORT;

                Toast libraryAppToast = Toast.makeText(context, text, duration);
                libraryAppToast.show();
            }
        });

        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "This button will launch my Build It Bigger app";
                int duration = Toast.LENGTH_SHORT;

                Toast buildItBiggerToast = Toast.makeText(context, text, duration);
                buildItBiggerToast.show();
            }
        });

        baconReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "This button will launch my Bacon Reader app";
                int duration = Toast.LENGTH_SHORT;

                Toast baconReaderToast = Toast.makeText(context, text, duration);
                baconReaderToast.show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "This button will launch my Capstone app";
                int duration = Toast.LENGTH_SHORT;

                Toast capstoneToast = Toast.makeText(context, text, duration);
                capstoneToast.show();
            }
        });

        return view;
    }
}
