package com.example.android_gui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class reciever_information_form extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.reciever_information_form); // Set the content view to the XML layout

        findViewById(R.id.receiverNextbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(reciever_information_form.this, review_information.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
