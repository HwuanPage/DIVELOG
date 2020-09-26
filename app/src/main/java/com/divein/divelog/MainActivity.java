package com.divein.divelog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent in_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in_add=new Intent(this,log_add.class);
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_add:
                startActivity(in_add);
                break;
        }
    }
}