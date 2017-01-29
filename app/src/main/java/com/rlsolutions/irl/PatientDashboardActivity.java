package com.rlsolutions.irl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PatientDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        intent = new Intent(this, MainActivity.class);
        setContentView(R.layout.activity_patient_dashboard);

    }
}
