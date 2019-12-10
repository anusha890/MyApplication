package com.anusha.myapplication.ui.tools;

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

public class ToolsFragment extends Fragment implements View.OnClickListener{
private EditText etswap,etswap1;
private Button btnswap;

    private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tools, container, false);

        etswap = view.findViewById(R.id.etswap);
        etswap1 = view.findViewById(R.id.etswap1);
        btnswap = view.findViewById(R.id.btnswap);

        btnswap.setOnClickListener(this);
        return view;
    }
    @Override
    public  void onClick(View v) {
        int swap = Integer.parseInt(etswap.getText().toString());
        int swap1 = Integer.parseInt(etswap1.getText().toString());
       etswap.setText(Integer.toString(swap1));
       etswap1.setText(Integer.toString(swap));


    }
        }