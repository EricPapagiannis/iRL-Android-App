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

    public void goToPatientDashboard() {
        Intent intent = new Intent(this, PatientDashboardActivity.class);
        startActivity(intent);
    }

    public void goToHealthCareProvDashboard() {
        Intent intent = new Intent(this, HealthCareProvDashboard.class);
        startActivity(intent);
    }
    public boolean isHCP(){
        //Some code
        return true;
    }
    public void Navigate(View view){
        if (isHCP()){
            goToHealthCareProvDashboard();
        }
        else {
            goToPatientDashboard();
        }
    }
}
