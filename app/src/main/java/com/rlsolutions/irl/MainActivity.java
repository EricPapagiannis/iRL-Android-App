package com.rlsolutions.irl;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      Button btn=(Button)findViewById(R.id.notif);

        setContentView(R.layout.activity_main);
    }
    public void getNotification(View view)
    {
        NotificationManager notificationmgr=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        Intent intent=new Intent(this,PatientDashboardActivity.class);
        PendingIntent pintent= PendingIntent.getActivities(this,(int) System.currentTimeMillis(), new Intent[]{intent}, 0);

        Notification notif=new Notification.Builder(this)
                .setSmallIcon(R.drawable.ic_stat_name)
                .setContentTitle("INFORMATIONDKFJDSKFKL")
                .setContentText("DJFDKFDSJKL")
                .setContentIntent(pintent)
                .build();
        notificationmgr.notify(0,notif);

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

