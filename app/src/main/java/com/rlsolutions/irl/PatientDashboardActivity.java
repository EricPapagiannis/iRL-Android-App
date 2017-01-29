package com.rlsolutions.irl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
        int ratio = 100*(this.servingVeg + this.servingFru + this.servingMea + this.servingGra + this.servingDai)/(this.totalServings);
        if (ratio != 100) {
            prg.setProgress(ratio);
        } else {
            prg.setProgress(ratio);
            Toast.makeText(getApplicationContext(), "Good job at keeping a healty diet!\nKeep up the good work!", Toast.LENGTH_LONG).show();
        }
    }

    void addVeg(View view) {
        if (this.servingVeg < this.totalServingVeg) {
            this.servingVeg++;
            TextView txt = (TextView) findViewById(R.id.servingsvegetables);
            txt.setText(this.servingVeg + "/"  + this.totalServingVeg);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Please follow your diet!", Toast.LENGTH_SHORT).show();
        }
    }

    void subVeg(View view) {
        if (this.servingVeg > 0) {
            this.servingVeg--;
            TextView txt = (TextView) findViewById(R.id.servingsvegetables);
            txt.setText(this.servingVeg + "/"  + this.totalServingVeg);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid!", Toast.LENGTH_SHORT).show();
        }
    }

    void addFru(View view) {
        if (this.servingFru < this.totalServingFru) {
            this.servingFru++;
            TextView txt = (TextView) findViewById(R.id.servingsfruit);
            txt.setText(this.servingFru + "/"  + this.totalServingFru);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Please follow your diet!", Toast.LENGTH_SHORT).show();
        }
    }

    void subFru(View view) {
        if (this.servingFru> 0) {
            this.servingFru--;
            TextView txt = (TextView) findViewById(R.id.servingsfruit);
            txt.setText(this.servingFru + "/"  + this.totalServingFru);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid!", Toast.LENGTH_SHORT).show();
        }
    }

    void addGra(View view) {
        if (this.servingGra < this.totalServingGra) {
            this.servingGra++;
            TextView txt = (TextView) findViewById(R.id.servingsgrains);
            txt.setText(this.servingGra + "/"  + this.totalServingGra);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Please follow your diet!", Toast.LENGTH_SHORT).show();
        }
    }

    void subGra(View view) {
        if (this.servingGra> 0) {
            this.servingGra--;
            TextView txt = (TextView) findViewById(R.id.servingsgrains);
            txt.setText(this.servingGra + "/"  + this.totalServingGra);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid!", Toast.LENGTH_SHORT).show();
        }
    }

    void addMea(View view) {
        if (this.servingMea < this.totalServingMea) {
            this.servingMea++;
            TextView txt = (TextView) findViewById(R.id.servingsmeat);
            txt.setText(this.servingMea + "/"  + this.totalServingMea);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Please follow your diet!", Toast.LENGTH_SHORT).show();
        }
    }

    void subMea(View view) {
        if (this.servingMea> 0) {
            this.servingMea--;
            TextView txt = (TextView) findViewById(R.id.servingsmeat);
            txt.setText(this.servingMea + "/"  + this.totalServingMea);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid!", Toast.LENGTH_SHORT).show();
        }
    }

    void addDai(View view) {
        if (this.servingDai < this.totalServingDai) {
            this.servingDai++;
            TextView txt = (TextView) findViewById(R.id.servingsdairy);
            txt.setText(this.servingDai + "/"  + this.totalServingDai);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Please follow your diet!", Toast.LENGTH_SHORT).show();
        }
    }

    void subDai(View view) {
        if (this.servingDai> 0) {
            this.servingDai--;
            TextView txt = (TextView) findViewById(R.id.servingsdairy);
            txt.setText(this.servingDai + "/"  + this.totalServingDai);
            updateBar();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid!", Toast.LENGTH_SHORT).show();
        }
    }

}
