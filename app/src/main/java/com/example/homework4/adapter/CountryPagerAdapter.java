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
                        "The UK is an island nation in northwestern Europe aihsbfgipqebgfiqerbgpqiergbperigbnewrpougnwerpiujgbnqrehjigbewriphgbwerpigbwertpigbwerogbnewrougbnwerognewrpigmwerpgmeaihsbfgipqebgfiqerbgpqiergbperigbnewrpougnwerpiujgbnqrehjigbewriphgbwerpigbwertpigbwerogbnewrougbnwerognewrpigmwerpgmewrpgmewr[pkgmwer[pgmewr[pkgmn[ewtrjognewtrhjipgbpewirgbewriogbpiewbn[owrjgfbnwetro[jnpogfjbonefipjbvnweougj[weewtrhhhwrthetryhetyjtreyjtryuklmk;ewgrbjml ewfbmkol;ewgrfbmkl; yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy<ImageView\n" +
                                "            android:id=\"@+id/leader_image\"\n" +
                                "            android:layout_width=\"match_parent\"\n" +
                                "            android:layout_height=\"200dp\"\n" +
                                "            android:layout_marginBottom=\"16dp\"\n" +
                                "            android:background=\"@drawable/image_border\"\n" +
                                "            android:scaleType=\"centerCrop\"\n" +
                                "            tools:ignore=\"ContentDescription,ImageContrastCheck\" />\n" +
                                "\n" +
                                "        <!-- Leader Info -->\n" +
                                "        <TextView\n" +
                                "            android:id=\"@+id/name_text\"\n" +
                                "            android:layout_width=\"match_parent\"\n" +
                                "            android:layout_height=\"wrap_content\"\n" +
                                "            android:textSize=\"20sp\"\n" +
                                "            android:textStyle=\"bold\"\n" +
                                "            android:gravity=\"center\"\n" +
                                "            android:textColor=\"#333333\"\n" +
                                "            android:layout_marginBottom=\"8dp\" />\n" +
                                "\n" +
                                "        <TextView\n" +
                                "            android:id=\"@+id/position_text\"\n" +
                                "            android:layout_width=\"match_parent\"\n" +
                                "            android:layout_height=\"wrap_content\"\n" +
                                "            android:textSize=\"16sp\"\n" +
                                "            android:gravity=\"center\"\n" +
                                "            android:textColor=\"#666666\"\n" +
                                "            android:layout_marginBottom=\"16dp\" />\n" +
                                "\n" +
                                "        <TextView\n" +
                                "            android:id=\"@+id/description_text\"\n" +
                                "            android:layout_width=\"match_parent\"\n" +
                                "            android:layout_height=\"wrap_content\"\n" +
                                "            android:textSize=\"14sp\"\n" +
                                "            android:textColor=\"#333333\"\n" +
                                "            android:lineSpacingExtra=\"4dp\" />\n" +
                                "\n" +
                                "    </LinearLayout>\n" +
                                "thêm loadingyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyygrehtjmnl;etrhyjmnopetrhjnopetryhjnoptrhye.",
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
