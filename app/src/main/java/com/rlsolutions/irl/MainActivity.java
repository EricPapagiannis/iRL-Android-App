package com.rlsolutions.irl;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.content.BroadcastReceiver;

public class MainActivity extends AppCompatActivity {

    Button btn;
    NotificationManager notificationManager;
    int notifID=33;
    boolean isNotificActive=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.notif);
    }
    public void getNotification(View view)
    {
        Uri alarmSound= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder notificBulider= (NotificationCompat.Builder) new
                NotificationCompat.Builder(this)
                .setSound(alarmSound)
                .setAutoCancel(true)
                .setVibrate(new long[] {0,1000,1000,1000,1000})
                .setSmallIcon(R.drawable.ic_stat_name)
                .setContentTitle("Testing Notifications")
                .setContentText("Description of notification")
                .setTicker("This is the message");

        Intent nextpage = new Intent(this, HealthCareProvDashboardActivity.class);
        TaskStackBuilder tStackBuilder=TaskStackBuilder.create(this);
        tStackBuilder.addParentStack(HealthCareProvDashboardActivity.class);
        tStackBuilder.addNextIntent(nextpage);
        PendingIntent pendingIntent=tStackBuilder.getPendingIntent(0,
                PendingIntent.FLAG_UPDATE_CURRENT);
        notificBulider.setContentIntent(pendingIntent);
        notificationManager =(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(notifID,notificBulider.build());
        isNotificActive=true;





    }


    public void goToPatientDashboard(View view) {
        Intent intent = new Intent(this, PatientDashboardActivity.class);
        startActivity(intent);
    }

    public void goToHealthCareProvDashboard(View view) {
        Intent intent = new Intent(this, HealthCareProvDashboardActivity.class);
        startActivity(intent);
    }
    public boolean isHCP(){
        //Some code
        return true;
    }
    /*
    public void Navigate(View view){
        if (login()) {
            if (isHCP()) {
                goToHealthCareProvDashboard();
            } else {
                goToPatientDashboard();
            }
        } else {
        }
    }

    private boolean login() {
        return true;
    }
    */
}

