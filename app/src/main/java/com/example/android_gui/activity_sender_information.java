package com.example.android_gui;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_sender_information extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sender_information); // Set the content view to the XML layout

        EditText senderEmail = findViewById(R.id.senderEmail);
        EditText senderName = findViewById(R.id.senderName);
        EditText senderContact = findViewById(R.id.senderContact);
        EditText senderCountry = findViewById(R.id.senderCountry);
        EditText senderAddress = findViewById(R.id.senderAddress);

        //findViewById(R.id.)
    }


}
