package com.example.order_app_gui.ui.watch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.order_app_gui.databinding.FragmentWatchBinding;

public class WatchFragment extends Fragment {

    private FragmentWatchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        WatchViewModel watchViewModel =
                new ViewModelProvider(this).get(WatchViewModel.class);

        binding = FragmentWatchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}