package com.wenzh.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_num0 = findViewById(R.id.BT_num0);
        bt_num0.setOnClickListener(this);
        Button bt_num1 = findViewById(R.id.BT_num1);
        bt_num1.setOnClickListener(this);
        Button bt_num2 = findViewById(R.id.BT_num2);
        bt_num2.setOnClickListener(this);
        Button bt_num3 = findViewById(R.id.BT_num3);
        bt_num3.setOnClickListener(this);
        Button bt_num4 = findViewById(R.id.BT_num4);
        bt_num4.setOnClickListener(this);
        Button bt_num5 = findViewById(R.id.BT_num5);
        bt_num5.setOnClickListener(this);
        Button bt_num6 = findViewById(R.id.BT_num6);
        bt_num6.setOnClickListener(this);
        Button bt_num7 = findViewById(R.id.BT_num7);
        bt_num7.setOnClickListener(this);
        Button bt_num8 = findViewById(R.id.BT_num8);
        bt_num8.setOnClickListener(this);
        Button bt_num9 = findViewById(R.id.BT_num9);
        bt_num9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.BT_num0:
                break;
            case R.id.BT_num1:
                break;
            case R.id.BT_num2:
                break;
            case R.id.BT_num3:
                break;
            case R.id.BT_num4:
                break;
            case R.id.BT_num5:
                break;
            case R.id.BT_num6:
                break;
            case R.id.BT_num7:
                break;
            default:break;
        }
    }
}
