package com.anusha.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.anusha.myapplication.R;

public class HomeFragment extends Fragment implements View.OnClickListener{
private EditText etpalindrome;
private Button btnpalindrome;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        etpalindrome = view.findViewById(R.id.etpalindrome);
        btnpalindrome = view.findViewById(R.id.btnpalindrome);

        btnpalindrome.setOnClickListener(this);
        return view;
    }
    @Override
    public  void onClick(View v) {


       int no = Integer.parseInt(etpalindrome.getText().toString());
        Palindrome palindrome = new Palindrome();
        int result = palindrome.reverse(no);
        if (result == no) {
            Toast.makeText(getActivity(), "is Palindrome : " + result, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getActivity(), "is not Palindrome : " + result, Toast.LENGTH_SHORT).show();



    }
//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
    }
}