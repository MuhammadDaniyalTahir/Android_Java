package com.example.android_gui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class reciever_information_form extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.reciever_information_form); // Set the content view to the XML layout

        EditText receiverEmail = findViewById(R.id.receiverEmail);
        EditText receiverName = findViewById(R.id.receiverName);
        EditText receiverContact = findViewById(R.id.receiverContact);
        EditText receiverCountry = findViewById(R.id.receiverCountry);
        EditText receiverAddress = findViewById(R.id.receiverAddress);

        findViewById(R.id.receiverNextbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = receiverEmail.getText().toString();
                String name = receiverName.getText().toString();
                String contact = receiverContact.getText().toString();
                String country = receiverCountry.getText().toString();
                String address = receiverAddress.getText().toString();


                Intent intent = new Intent(reciever_information_form.this, review_information.class);


                intent.putExtra("receiverEmail", email);
                intent.putExtra("receiverName", name);
                intent.putExtra("receiverContact", contact);
                intent.putExtra("receiverCountry", country);
                intent.putExtra("receiverAddress", address);

                intent.putExtra("senderEmail", getIntent().getStringExtra("senderEmail"));
                intent.putExtra("senderName", getIntent().getStringExtra("senderName"));
                intent.putExtra("senderContact", getIntent().getStringExtra("senderContact"));
                intent.putExtra("senderCountry", getIntent().getStringExtra("senderCountry"));
                intent.putExtra("senderAddress", getIntent().getStringExtra("senderAddress"));

                startActivity(intent);
                finish();
            }
        });
    }
}
