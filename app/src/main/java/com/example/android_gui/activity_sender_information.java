package com.example.android_gui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

        findViewById(R.id.senderNextbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = senderEmail.getText().toString();
                String name = senderName.getText().toString();
                String contact = senderContact.getText().toString();
                String country = senderCountry.getText().toString();
                String address = senderAddress.getText().toString();

                Intent intent = new Intent(activity_sender_information.this, reciever_information_form.class);

                intent.putExtra("senderEmail", email);
                intent.putExtra("senderName", name);
                intent.putExtra("senderContact", contact);
                intent.putExtra("senderCountry", country);
                intent.putExtra("senderAddress", address);

                startActivity(intent);
                finish();
            }
        });

    }


}
