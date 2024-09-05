package com.example.android_gui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class review_information extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.review_information); // Set the content view to the XML layout

        //Where we will add our layout of new information received
        LinearLayout parentLayout = findViewById(R.id.parentLayoutReviewInformation);
        Intent intent = getIntent();
        intent.getStringExtra("senderName");

        //Which will contain three sub portions
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        //sender layout
        LinearLayout senderLayout = new LinearLayout(this);
        senderLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        senderLayout.setOrientation(LinearLayout.HORIZONTAL);

        //Now add the sender layout inside the parent layout
        parentLayout.addView(senderLayout);

        //Creating textViews of sender name
        TextView senderNametextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        senderNametextView.setText(intent.getStringExtra("senderName"));
        senderLayout.addView(senderNametextView);

        //Creating textViews of sender Email
        TextView senderEmailtextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        senderEmailtextView.setText(intent.getStringExtra("senderEmail"));
        senderLayout.addView(senderEmailtextView);

        //Creating textViews of sender Contact Information.







        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(review_information.this, activity_sender_information.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
