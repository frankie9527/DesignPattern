package com.android.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.design.factory.simple.SimpleFactoryActivity;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fractory(View view){
        intent=new Intent(this,SimpleFactoryActivity.class);
        startActivity(intent);
    }
}
