package com.anusha.myapplication.ui.gallery;

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

public class GalleryFragment extends Fragment implements View.OnClickListener{
    private Button btncalculate;
    private EditText etradius;
    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        etradius = view.findViewById(R.id.etradius);

        btncalculate = view.findViewById(R.id.btncalculate);
        btncalculate.setOnClickListener(this);
        return view;
    }
    @Override
    public  void onClick(View v) {
        float radius = Float.parseFloat(etradius.getText().toString());
        float area = 3.14f * radius* radius;

        Toast.makeText(getActivity(),"Area of circle is : " + area, Toast.LENGTH_SHORT).show();
    }

}