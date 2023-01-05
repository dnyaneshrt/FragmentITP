package com.itp.myfragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button btn_income,btn_expense,btn_test;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn_income= findViewById(R.id.btn_income);
       btn_expense= findViewById(R.id.btn_expense);
       btn_test=findViewById(R.id.btn_test);
       frameLayout= findViewById(R.id.frame);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction tx=fragmentManager.beginTransaction();
        tx.add(R.id.frame,new TestFragment());
        tx.commit();


       btn_income.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View view) {
               FragmentManager fragmentManager=getSupportFragmentManager();
               FragmentTransaction tx=fragmentManager.beginTransaction();
               tx.add(R.id.frame,new IncomeFragment());
               tx.commit();
           }
       });

        btn_expense.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction tx=fragmentManager.beginTransaction();
                tx.add(R.id.frame,new ExpenseFragment());
                tx.commit();
            }
        });
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction tx=fragmentManager.beginTransaction();
                tx.add(R.id.frame,new TestFragment());
                tx.commit();
            }
        });



    }
}