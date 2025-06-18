package com.example.homework4.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.homework4.fragment.WonderFragment;


public class WonderPagerAdapter extends FragmentStateAdapter {

    public WonderPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return WonderFragment.newInstance(
                        "Great Wall of China",
                        "China",
                        "The Great Wall is a series of fortifications built along the northern borders of China to protect against invasions."
                );
            case 1:
                return WonderFragment.newInstance(
                        "Christ the Redeemer",
                        "Brazil",
                        "A massive statue of Jesus Christ in Rio de Janeiro, one of the New Seven Wonders of the World."
                );
            case 2:
                return WonderFragment.newInstance(
                        "Taj Mahal",
                        "India",
                        "A white marble mausoleum built in Agra, India, symbolizing eternal love."
                );
            default:
                return new Fragment(); // fallback
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
