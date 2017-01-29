package com.rlsolutions.irl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HealthCareProvDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_health_care_prov_dashboard);
        intent = new Intent(this, MainActivity.class);

        Button myButton = (Button) findViewById(R.id.delete_button);
        myButton.setEnabled(false);
    }

    public void clickSearch(View view){
        Button myButton = (Button) findViewById(R.id.delete_button);
        myButton.setEnabled(true);
    }

    public void goToRegisterPage(View view){
        Intent intent =  new Intent(this, RegisterPatientActivity.class);
        startActivity(intent);
    }
}
