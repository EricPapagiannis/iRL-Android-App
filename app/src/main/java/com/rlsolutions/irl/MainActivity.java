package com.rlsolutions.irl;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

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
    public void getNotification(View view) {
        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder notificBulider = (NotificationCompat.Builder) new
                NotificationCompat.Builder(this)
                .setSound(alarmSound)
                .setAutoCancel(true)
                .setVibrate(new long[]{0, 1000, 1000, 1000, 1000})
                .setSmallIcon(R.drawable.ic_stat_name)
                .setContentTitle("Upcoming Meal!")
                .setContentText("Please eat your Vegetable and Meat food group(s)")
                .setTicker("Eat it at 12:30pm");

        Intent nextpage = new Intent(this, HealthCareProvDashboardActivity.class);
        TaskStackBuilder tStackBuilder = TaskStackBuilder.create(this);
        tStackBuilder.addParentStack(HealthCareProvDashboardActivity.class);
        tStackBuilder.addNextIntent(nextpage);
        PendingIntent pendingIntent = tStackBuilder.getPendingIntent(0,
                PendingIntent.FLAG_UPDATE_CURRENT);
        notificBulider.setContentIntent(pendingIntent);
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(notifID, notificBulider.build());
        isNotificActive = true;
    }

    public void goToPatientDashboard(View view) {
        Intent intent = new Intent(this, PatientDashboardActivity.class);
        startActivity(intent);
    }

    public void goToHealthCareProvDashboard(View view) {
        Intent intent = new Intent(this, HealthCareProvDashboardActivity.class);

        EditText username = (EditText) findViewById(R.id.login_email);
        EditText password = (EditText) findViewById(R.id.login_password);

        String sUsername = username.getText().toString();
        String sPassword = password.getText().toString();

        boolean validUsername = false;
        boolean validPassword = false;

        try {
            InputStream is = getAssets().open("HCPAccounts");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String textToParse = new String(buffer);

            ArrayList<HealthProvider> HCPList;
            HCPList = Functions.stringToHCPs(textToParse);

            for (HealthProvider hcp: HCPList){
                if (hcp.getUserName().equals(sUsername)){
                    validUsername = true;
                }
                if(hcp.getPassword().equals(sPassword)){
                    validPassword = true;
                }
                if(validUsername && validPassword){
                    break;
                }
            }
            if (!validUsername) {
                username.setError("Invalid Username");
            }
            else if(!validPassword) {
                password.setError("Invalid Password");
            }
            else {
                startActivity(intent);
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

