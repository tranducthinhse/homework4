package com.example.homework4.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.homework4.R;


public class MuseumFragment extends Fragment {

    private static final String ARG_NAME = "name";
    private static final String ARG_LOCATION = "location";
    private static final String ARG_DESCRIPTION = "description";

    private String name;
    private String location;
    private String description;

    public static MuseumFragment newInstance(String name, String location, String description) {
        MuseumFragment fragment = new MuseumFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        args.putString(ARG_LOCATION, location);
        args.putString(ARG_DESCRIPTION, description);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(ARG_NAME);
            location = getArguments().getString(ARG_LOCATION);
            description = getArguments().getString(ARG_DESCRIPTION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_museum, container, false);

        ImageView museumImage = view.findViewById(R.id.museum_image);
        TextView nameText = view.findViewById(R.id.name_text);
        TextView locationText = view.findViewById(R.id.location_text);
        TextView descriptionText = view.findViewById(R.id.description_text);

        // Set image based on museum
        switch (name) {
            case "Camnou":
                museumImage.setImageResource(R.drawable.louvre);
                break;
            case "Etihal":
                museumImage.setImageResource(R.drawable.british_museum);
                break;
            case "Bernabeu":
                museumImage.setImageResource(R.drawable.met_museum);
                break;
        }

        nameText.setText(name);
        locationText.setText(location);
        descriptionText.setText(description);

        return view;
    }
}