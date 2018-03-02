package com.runkevich8.gmail.test.homework.hw5;


import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.runkevich8.gmail.test.R;

public class Homework5Activity extends AppCompatActivity {

    private Button buttonWiFi;
    private boolean isReceiverRegistered = false;
    private boolean isConnected;
    private String MESSAGE;

    private static TextView internetStatus;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw5);
        internetStatus = (TextView) findViewById(R.id.hw5_internet_status);

        // At activity startup we manually check the internet status and change
        // the text status

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (networkInfo != null && networkInfo.isConnected()) {
            changeTextStatus(true);
        } else {
            changeTextStatus(false);
        }

    }
    public void changeTextStatus(boolean isConnected) {

        // Change status according to boolean value
        if (isConnected) {
            internetStatus.setText("Wifi включен.");
            internetStatus.setTextColor(Color.parseColor("#00ff00"));
        } else {
            internetStatus.setText("Wifi выключен.");
            internetStatus.setTextColor(Color.parseColor("#ff0000"));
        }
    }


    @Override
    protected void onPause() {

        super.onPause();
        MyApplication.activityPaused();// On Pause notify the Application
    }

    @Override
    protected void onResume() {

        super.onResume();
        MyApplication.activityResumed();// On Resume notify the Application
    }


//
//
//
//    private BroadcastReceiver receiver = new BroadcastReceiver() {
//        public void onReceive(Context context, Intent intent) {
//
//            NetworkInfo info = getNetworkInfo(context);
//            if (info != null && info.isConnected()) {
//                isConnected = true;
//                MESSAGE = "Wifi подключен";
//             //   updateFloatingButton();
//            } else {
//                isConnected = false;
//                MESSAGE = "Wifi выключен";
//                //updateFloatingButton();
//            }
//        }
//    };
//    private NetworkInfo getNetworkInfo(Context context) {
//        ConnectivityManager connManager = (ConnectivityManager)
//                context.getSystemService(Context.CONNECTIVITY_SERVICE);
//        return connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
//    }
//    protected void onResume() {
//        super.onResume();
//        if (!isReceiverRegistered) {
//            isReceiverRegistered = true;
//            registerReceiver(receiver, new IntentFilter("android.net.wifi.STATE_CHANGE"));
//        }
//    }
//    protected void onPause() {
//        super.onPause();
//        if (isReceiverRegistered) {
//            isReceiverRegistered = false;
//            unregisterReceiver(receiver);
//        }
//    }
//

}
