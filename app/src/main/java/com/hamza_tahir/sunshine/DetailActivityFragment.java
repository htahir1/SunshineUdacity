package com.hamza_tahir.sunshine;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        Intent intent = getActivity().getIntent();
        String forecast = intent.getStringExtra("forecast");
        TextView forecastView = (TextView) rootView.findViewById(R.id.textView_forecastDetail);
        //Log.v("Forecast", forecast);
        forecastView.setText(forecast);
        return rootView;
    }
}
