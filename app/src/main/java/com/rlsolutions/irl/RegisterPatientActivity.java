package com.rlsolutions.irl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterPatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_patient);
        Intent intent = getIntent();
        intent = new Intent(this, HealthCareProvDashboardActivity.class);
    }

    public void registerPatient(View view) {
        // Required information
        EditText firstNameText = (EditText) findViewById(R.id.enter_first_name);
        EditText lastNameText = (EditText) findViewById(R.id.enter_last_name);
        EditText userNameText = (EditText) findViewById(R.id.enter_username);
        EditText passwordText = (EditText) findViewById(R.id.enter_password);

        // optional information
        EditText confirmPasswordText = (EditText) findViewById(R.id.confirm_password);

        String lastName = lastNameText.getText().toString();
        String firstName = firstNameText.getText().toString();
        String userName = userNameText.getText().toString();
        String password = passwordText.getText().toString();
        String confirmPassword = confirmPasswordText.getText().toString();

        if (firstName.equals("")) {
            firstNameText.setError("You have entered an invalid first name.");
        } else if (lastName.equals("")) {
            lastNameText.setError("You have entered an invalid last name.");
        } else if (userName.equals("")) {
            userNameText.setError("You have entred an invalid username.");
        } else if (!(confirmPassword.equals(password))) {
            confirmPasswordText.setError("Passwords dont match");
        } else {
            Intent intent = new Intent(this, HealthCareProvDashboardActivity.class);
            //Client client = new Client(userName, password, firstName, lastName,HealthProvider h = new HealthProvider("k","m","k","m") );
            Toast.makeText(getApplicationContext(), "Patient Registered", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }
}