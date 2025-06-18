package com.example.homework4.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homework4.R;


public class CountryFragment extends Fragment {

    private static final String ARG_NAME = "name";
    private static final String ARG_CAPITAL = "capital";
    private static final String ARG_DESCRIPTION = "description";
    private static final String ARG_FLAG = "flag";
    private static final String ARG_AREA = "area";
    private static final String ARG_LANGUAGE = "language";

    private String name, capital, description, area, language;
    private int flagResId;

    public static CountryFragment newInstance(String name, String capital, String description, int flagResId, String area, String language) {
        CountryFragment fragment = new CountryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        args.putString(ARG_CAPITAL, capital);
        args.putString(ARG_DESCRIPTION, description);
        args.putInt(ARG_FLAG, flagResId);
        args.putString(ARG_AREA, area);
        args.putString(ARG_LANGUAGE, language);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(ARG_NAME);
            capital = getArguments().getString(ARG_CAPITAL);
            description = getArguments().getString(ARG_DESCRIPTION);
            flagResId = getArguments().getInt(ARG_FLAG);
            area = getArguments().getString(ARG_AREA);
            language = getArguments().getString(ARG_LANGUAGE);
        }
    }

    @SuppressLint("SetTextI18n")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_country, container, false);

        TextView nameText = view.findViewById(R.id.name_text);
        TextView capitalText = view.findViewById(R.id.capital_text);
        TextView descriptionText = view.findViewById(R.id.description_text);
        TextView areaText = view.findViewById(R.id.area_text);
        TextView languageText = view.findViewById(R.id.language_text);
        ImageView flagImage = view.findViewById(R.id.flag_image);

        nameText.setText(name);
        capitalText.setText("Capital: " + capital);
        descriptionText.setText(description);
        areaText.setText("Area: " + area);
        languageText.setText("Language: " + language);
        flagImage.setImageResource(flagResId);

        return view;
    }
}
