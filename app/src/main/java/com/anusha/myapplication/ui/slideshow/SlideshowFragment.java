package com.anusha.myapplication.ui.slideshow;

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
import com.anusha.myapplication.ui.home.Palindrome;

public class SlideshowFragment extends Fragment implements View.OnClickListener {
    private EditText etautomorphic;
    private Button btncheck;


    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);

        etautomorphic = view.findViewById(R.id.etautomorphic);

        btncheck = view.findViewById(R.id.btncheck);

        btncheck.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int a, square, counter = 1;
        int n = Integer.parseInt(etautomorphic.getText().toString());
        a = n;
        square = n * n;
        while (n != 0) {
            counter = counter * 10;
            n = n / 10;
        }

        if  (square % counter == a) {
            Toast.makeText(getActivity(), "is Auto-Morphic : " + a, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getActivity(), "is not Auto-Morphic : " + a, Toast.LENGTH_SHORT).show();


        }

    }
}

//        slideshowViewModel =
//                ViewModelProviders.of(this).get(SlideshowViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        slideshowViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;

