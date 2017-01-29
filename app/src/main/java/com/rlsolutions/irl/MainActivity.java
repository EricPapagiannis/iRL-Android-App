package com.rlsolutions.irl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
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

