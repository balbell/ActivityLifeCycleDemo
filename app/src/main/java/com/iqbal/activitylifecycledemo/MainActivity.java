package com.iqbal.activitylifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOutput;
    Integer bilangan;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lifecycle", "onCreate : Activity created");
        btnSubmit = findViewById(R.id.btncount);
        tvOutput = findViewById(R.id.tvOutput);
        bilangan = 0;

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bilangan++;
                tvOutput.setText(bilangan.toString());
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "onStart : Activity Started");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "onResume : Activity resume");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "onPause : ActivityPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "onStop : Activity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","onDestroy : Activity Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle","onRestart : Activity Restart");

    }
}
