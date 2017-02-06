package com.rlsolutions.irl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class HealthCareProvDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        setContentView(R.layout.activity_health_care_prov_dashboard);
        intent = new Intent(this, MainActivity.class);

        try {
            Client createdClient = (Client) intent.getSerializableExtra("Client key");
            TextView patientList = (TextView) findViewById(R.id.patient_list);
            patientList.setText(patientList.getText() + "\n" + createdClient.getlName() + ", "
                    + createdClient.getfName() + ": " + createdClient.getUserName());
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

        Button myButton = (Button) findViewById(R.id.delete_button);
        myButton.setEnabled(false);
    }

    public void clickSearch(View view){
        Button myButton = (Button) findViewById(R.id.delete_button);
        myButton.setEnabled(true);
    }

    public void goToRegisterPage(View view){
        Intent intent =  new Intent(this, RegisterPatientActivity.class);
        HealthProvider hcp = (HealthProvider) intent.getSerializableExtra("HCP");
        intent.putExtra("HCP", hcp);
        startActivity(intent);
    }
}
