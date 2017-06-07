package com.example.yuxuan.gittest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Yuxuan on 2017/6/7.
 */

public class NewActivity extends AppCompatActivity {
    public int a;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=2;

    }
}
