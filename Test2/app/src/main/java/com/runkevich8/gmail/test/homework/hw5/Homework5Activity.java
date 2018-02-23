package com.runkevich8.gmail.test.homework.hw5;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.runkevich8.gmail.test.R;

public class Homework5Activity extends AppCompatActivity {

    Button buttonWiFi;
    private LocalBroadcastManager broadcastManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw5);

        buttonWiFi = findViewById(R.id.button_hw_5);

        buttonWiFi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent intent = new Intent(ACTION_MY_MESSAGE);
                //broadcastManager.sendBroadcast(intent);

            }
        });
    }

    private BroadcastReceiver myReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            Log.e("OOOOOOOOOOOOOOOOO","MY MESSAGE FROM ACTIVITY");

            final String action = intent.getAction();
            assert action != null;
            if (action.equals(WifiManager.SUPPLICANT_CONNECTION_CHANGE_ACTION)) {
                if (intent.getBooleanExtra(WifiManager.EXTRA_SUPPLICANT_CONNECTED, false)){
                    //do stuff
                    Log.e("OOOOOOOOOOOOOOOOO","MESSAGE FROM ACTIVITY ON");
                } else {
                    Log.e("OOOOOOOOOOOOOOOOO","MESSAGE FROM ACTIVITY OFF");
                    // wifi connection was lost
                }
            }

            //        boolean isAirplaneModeOn = intent.getBooleanExtra("state",
//                    false);
//            if (isAirplaneModeOn){
//                Log.e("OOOOOOOOOOOOOOOOO","MESSAGE FROM ACTIVITY ON");
//            } else {
//                Log.e("OOOOOOOOOOOOOOOOO","MESSAGE FROM ACTIVITY OFF");
//            }

        }
    };

    @Override
    protected void onStart() {
        super.onStart();

        IntentFilter intentFilter = new IntentFilter();
     //   intentFilter.addAction(ACTION_MY_MESSAGE);

        broadcastManager.registerReceiver(myReceiver, intentFilter);

        Intent intent = new Intent(this,
                MyReceiver.class);
        startService(intent);

    }

    @Override
    protected void onStop() {
        super.onStop();
        broadcastManager.unregisterReceiver(myReceiver);

        stopService(new Intent(this,
                MyReceiver.class));
    }
}
