package com.example.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.testlib.R;

import papaya.in.toasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this, msg: "Ngeteh Doang");
    }
}