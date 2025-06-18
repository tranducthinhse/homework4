package com.example.homework4.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.homework4.R;


public class LeaderFragment extends Fragment {

    private static final String ARG_NAME = "name";
    private static final String ARG_POSITION = "position";
    private static final String ARG_DESCRIPTION = "description";

    private String name;
    private String position;
    private String description;

    public static LeaderFragment newInstance(String name, String position, String description) {
        LeaderFragment fragment = new LeaderFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        args.putString(ARG_POSITION, position);
        args.putString(ARG_DESCRIPTION, description);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(ARG_NAME);
            position = getArguments().getString(ARG_POSITION);
            description = getArguments().getString(ARG_DESCRIPTION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leader, container, false);

        ImageView leaderImage = view.findViewById(R.id.leader_image);
        TextView nameText = view.findViewById(R.id.name_text);
        TextView positionText = view.findViewById(R.id.position_text);
        TextView descriptionText = view.findViewById(R.id.description_text);

        // Set image based on leader
        switch (name) {
            case "Emmanuel Macron":
                leaderImage.setImageResource(R.drawable.macron);
                break;
            case "Joe Biden":
                leaderImage.setImageResource(R.drawable.biden);
                break;
            case "Keir Starmer":
                leaderImage.setImageResource(R.drawable.starmer);
                break;
        }

        nameText.setText(name);
        positionText.setText(position);
        descriptionText.setText(description);

        return view;
    }
}
