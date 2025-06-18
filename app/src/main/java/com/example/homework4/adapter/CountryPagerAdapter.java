package com.example.homework4.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.homework4.R;
import com.example.homework4.fragment.CountryFragment;


public class CountryPagerAdapter extends FragmentStateAdapter {

    public CountryPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return CountryFragment.newInstance(
                        "Russia",
                        "Russia",
                        "The UK is an island nation in northwestern Europe.",
                        R.drawable.rusia_flag,
                        "243,610 km²",
                        "English"
                );
            case 1:
                return CountryFragment.newInstance(
                        "Argentina",
                        "Argentina",
                        "Argentina is a European country with a long Mediterranean coastline.",
                        R.drawable.argentina_flag,
                        "301,340 km²",
                        "Italian"
                );
            case 2:
                return CountryFragment.newInstance(
                        "Portugal",
                        "Portugal",
                        "France is known for its fashion, wine, and iconic Eiffel Tower.",
                        R.drawable.portugal_flag,
                        "551,695 km²",
                        "French"
                );
            default:
                return new Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
