package com.example.infs3634homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // fc就是一个FrameLayout类型的实例， 它负责成为fragments的容器！！！
        FrameLayout fc = findViewById(R.id.main2_fc);

        // 创建一个HomeFragment的对象
        HomeFragment homeFragment = new HomeFragment();

        // 获得一个fragments的管理者
        getSupportFragmentManager().beginTransaction().replace(R.id.main2_fc, homeFragment).commit();

    }
}
