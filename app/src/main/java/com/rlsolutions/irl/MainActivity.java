package com.rlsolutions.irl;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    NotificationManager notificationManager;
    Button btn=(Button)findViewById(R.id.notif);
    setContentView(R.layout.activity_main);
    int notifID=33;
    boolean isNotificActive=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void getNotification(View view)
    {
        NotificationCompat.Builder notif=new
                NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_stat_name)
                .setContentTitle("Pls Hire Me")
                .setContentText("I am GOOD MAN")
                .setTicker("This is the message")
                .setContentIntent(pintent)
                .build();
        Intent nextpage = new Intent(this, PatientDashboardActivity.class);
        TaskStackBuilder tStackBuilder=TaskStackBuilder.create(this);
        tStackBuilder.addParentStack(PatientDashboardActivity.class);
        tStackBuilder.addNextIntent(nextpage);
        PendingIntent pendingIntent=tStackBuilder.getPendingIntent(0,
                PendingIntent.FLAG_UPDATE_CURRENT);
        notif.setContentIntent(pendingIntent);
        notificationManager =(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(notifID,notif.build());
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

