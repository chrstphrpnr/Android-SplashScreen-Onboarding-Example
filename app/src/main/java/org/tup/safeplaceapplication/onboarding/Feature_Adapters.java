package org.tup.safeplaceapplication.onboarding;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class Feature_Adapters extends FragmentStateAdapter {

    private final List<Fragment> fragments;


    public Feature_Adapters(@NonNull FragmentManager fragmentActivity, @NonNull Lifecycle lifecycle, List<Fragment> fragments) {
        super(fragmentActivity, lifecycle);
        this.fragments = fragments;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
