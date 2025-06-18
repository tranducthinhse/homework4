package com.example.homework4.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.homework4.fragment.LeaderFragment;


public class LeaderPagerAdapter extends FragmentStateAdapter {

    public LeaderPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return LeaderFragment.newInstance(
                        "Emmanuel Macron",
                        "France",
                        "Emmanuel Macron là Tổng thống Pháp từ năm 2017, tái đắc cử năm 2022. Ông là người sáng lập phong trào trung dung En Marche!, nổi tiếng với cải cách kinh tế và vai trò tích cực trong Liên minh châu Âu. Gần đây (tháng 6/2025), ông kêu gọi ngừng bắn giữa Israel và Iran, và đề xuất EU cấm mạng xã hội cho trẻ dưới 15 tuổi."
                );
            case 1:
                return LeaderFragment.newInstance(
                        "Joe Biden",
                        "USA",
                        "Joe Biden là Tổng thống thứ 46 của Mỹ (2021–2025), từng là Phó Tổng thống dưới thời Obama. Ông rút khỏi cuộc đua tái cử năm 2024 do sức khỏe, ủng hộ Kamala Harris. Tháng 5/2025, Biden được chẩn đoán ung thư tuyến tiền liệt và đang điều trị. Hiện ông là cựu tổng thống, vẫn có ảnh hưởng lớn trong Đảng Dân chủ."
                );
            case 2:
                return LeaderFragment.newInstance(
                        "Keir Starmer",
                        "United Kingdom",
                        "Keir Starmer là Thủ tướng Anh từ tháng 7/2024, lãnh đạo Đảng Lao động. Trước đó, ông là luật sư và Giám đốc Công tố. Ông thắng cử nhờ cam kết cải cách di trú, y tế, và đưa chính sách về trung dung."
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
