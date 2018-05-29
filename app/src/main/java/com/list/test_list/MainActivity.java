package com.list.test_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.oshirase).setOnClickListener(this);  //リスナーをボタンに登録

    }

    //ボタンが押された時の処理
    public void onClick(View view){
        Intent intent = new Intent(this, oshiraseActivity.class);
        startActivity(intent);
        //ここに遷移するための処理を追加する
    }
}