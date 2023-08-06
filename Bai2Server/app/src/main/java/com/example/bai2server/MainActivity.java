package com.example.bai2server;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Sever server;
    TextView info, infoip, msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = (TextView) findViewById(R.id.info);
        infoip = (TextView) findViewById(R.id.infoip);
        msg = (TextView) findViewById(R.id.msg);
        server = new Sever(this);
        infoip.setText(server.getIpAddress() + ":" + server.getPort());


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        server.onDestroy();
    }


}