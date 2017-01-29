package com.rlsolutions.irl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class PatientDashboardActivity extends AppCompatActivity {

    ProgressBar prg;
    int servingVeg = 0;
    int servingFru = 0;
    int servingMea = 0;
    int servingGra = 0;
    int servingDai = 0;
    int totalServingVeg;
    int totalServingFru;
    int totalServingMea;
    int totalServingGra;
    int totalServingDai;
    int totalServings;


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
        this.totalServingGra = 2;
        this.totalServingDai = 2;
        this.totalServings = this.totalServingVeg + this.totalServingFru + this.totalServingMea + this.totalServingGra + this.totalServingDai;
        TextView txt = (TextView) findViewById(R.id.servingsvegetables);
        txt.setText(servingVeg + "/"  + totalServingVeg);
        txt = (TextView) findViewById(R.id.servingsfruit);

        txt.setText(servingFru + "/"  + totalServingFru);
        txt = (TextView) findViewById(R.id.servingsmeat);

        txt.setText(servingMea + "/"  + totalServingMea);
        txt = (TextView) findViewById(R.id.servingsgrains);

        txt.setText(servingGra + "/"  + totalServingGra);
        txt = (TextView) findViewById(R.id.servingsdairy);

        txt.setText(servingDai + "/"  + totalServingDai);

    }

    void updateBar() {
        prg.setProgress(100*(this.servingVeg + this.servingFru + this.servingMea + this.servingGra + this.servingDai)/(this.totalServings));
    }

    void addVeg() {
        if (this.servingVeg <= this.totalServingVeg) {
            this.servingVeg++;
            TextView txt = (TextView) findViewById(R.id.servingsvegetables);
            txt.setText(servingVeg + "/"  + totalServingVeg);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Please follow your diet!", Toast.LENGTH_SHORT).show();
        }
    }

    void addFru() {
        if (this.servingFru <= this.totalServingFru) {
            this.servingFru++;
            TextView txt = (TextView) findViewById(R.id.servingsfruit);
            txt.setText(servingFru + "/"  + totalServingFru);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Please follow your diet!", Toast.LENGTH_SHORT).show();
        }
    }
}
