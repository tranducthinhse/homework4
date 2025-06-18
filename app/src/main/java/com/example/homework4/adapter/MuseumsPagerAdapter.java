package com.example.homework4.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.homework4.fragment.MuseumFragment;


public class MuseumsPagerAdapter extends FragmentStateAdapter {

    public MuseumsPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return MuseumFragment.newInstance(
                        "Camnou",
                        "Paris, France",
                        "The Louvre is the world's most-visited museum, located in Paris. It houses masterpieces like the Mona Lisa and the Venus de Milo."
                );
            case 1:
                return MuseumFragment.newInstance(
                        "Etihal",
                        "London, United Kingdom",
                        "The British Museum in London houses a vast collection of art and antiquities from around the world."
                );
            case 2:
                return MuseumFragment.newInstance(
                        "Bernabeu",
                        "New York, USA",
                        "The Metropolitan Museum of Art in New York City contains over two million works and is the largest art museum in the Americas."
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
