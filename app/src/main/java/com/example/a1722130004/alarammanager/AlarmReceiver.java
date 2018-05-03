package com.example.a1722130004.alarammanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 1722130004 on 02/05/2018.
 */

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent it = new Intent(context, MainActivity.class );
        context.startActivity(it);
        Toast.makeText(context, "teste de receiver de alarm", Toast.LENGTH_LONG).show();
    }
}
