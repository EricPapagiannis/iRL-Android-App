package com.rlsolutions.irl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

public class PatientDashboardActivity extends AppCompatActivity {

    ProgressBar prg;
    int servingVeg = 0;
    int servingFru = 0;
    int servingMea = 0;
    int servingWhe = 0;
    int servingDai = 0;
    int totalServingVeg;
    int totalServingFru;
    int totalServingMea;
    int totalServingWhe;
    int totalServingDai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        intent = new Intent(this, MainActivity.class);
        setContentView(R.layout.activity_patient_dashboard);
        prg = (ProgressBar) findViewById(R.id.progressBar);
        this.totalServingVeg = 3;
        this.totalServingFru = 2;
        this.totalServingMea = 1;
        this.totalServingWhe = 2;
        this.totalServingDai = 2;
        TextView txt = (TextView) findViewById(R.id.servingsvegetables);
        txt.setText(servingVeg + "/"  + totalServingVeg);
        txt.setText(servingFru + "/"  + totalServingFru);
        txt.setText(servingMea + "/"  + totalServingMea);
        txt.setText(servingWhe + "/"  + totalServingWhe);
        txt.setText(servingDai + "/"  + totalServingDai);
    }
}
