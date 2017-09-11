package com.example.mussabaheenmalik.newreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            //60 seconds into 30 minutes makes 30 minutes :)
            Thread.sleep(60000*30);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Toast.makeText(context, "WELLCOMMMEEE ! ", Toast.LENGTH_SHORT).show();
    }
}
