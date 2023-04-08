package com.example.fifth.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.fifth.MainActivity;
import com.example.fifth.R;
import com.example.fifth.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    MainActivity mainActivity;
    @NonNull FragmentSecondBinding binding;

    public SecondFragment() {
        super(R.layout.fragment_second);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view1, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view1, savedInstanceState);
        binding.button2.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("name", binding.editTextTextPersonName.getText().toString());
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_thirdFragment, bundle);
        });
    }
}
