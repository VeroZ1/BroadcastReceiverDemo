package com.example.broadcastreceiverdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Actions.ACTION_SET_TITLE);
                intent.putExtra("title", "I have changed");
                LocalBroadcastManager.getInstance(MainActivity2.this).sendBroadcast(intent);
                // sendBroadcast(intent);
            }
        });
    }
}