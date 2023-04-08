package com.example.fifth.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

import com.example.fifth.MainActivity;
import com.example.fifth.R;
import com.example.fifth.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {
    MainActivity mainActivity;
    FragmentThirdBinding binding;
    FragmentManager fragmentManager;
    public ThirdFragment() {
        super(R.layout.fragment_third);
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) context;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view1, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view1, savedInstanceState);
        Bundle bundle1 = getArguments();
        binding.textView6.setText(bundle1.getString("name"));
        binding.button3.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_secondFragment);
        });
    }
}
