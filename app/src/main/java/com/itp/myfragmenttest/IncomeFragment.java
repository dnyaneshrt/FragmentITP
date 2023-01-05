package com.itp.myfragmenttest;

//create a class as a child of androidx.fragment.app.Fragment
//override OnCreateView() method

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class IncomeFragment extends Fragment {
    Button  btn_test;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view= inflater.inflate(R.layout.add_income_layout,container,false);
        btn_test=view.findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "this is test", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
