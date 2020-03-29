package com.example.infs3634homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 创建一个HomeFragment的对象
        final HomeFragment homeFragment = new HomeFragment();
        final CollectionFragment collectionFragment = new CollectionFragment();

        // 获得一个fragments的管理者
        getSupportFragmentManager().beginTransaction().replace(R.id.main2_fc, homeFragment).commit();

        // 绑定控件
        Button homeBt = findViewById(R.id.main2_home);
        Button collBt = findViewById(R.id.main2_collection);

        // 给两个按钮设计监听器
        homeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.main2_fc, homeFragment).commit();
            }
        });

        collBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.main2_fc, collectionFragment).commit();
            }
        });
    }
}
