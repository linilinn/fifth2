package com.example.fifth.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.fifth.MainActivity;
import com.example.fifth.R;
import com.example.fifth.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    MainActivity mainActivity;
    FragmentFirstBinding binding;

    public FirstFragment() {
        super(R.layout.fragment_first);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view1, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view1, savedInstanceState);
        binding.button1.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment);
        });

    }
}
