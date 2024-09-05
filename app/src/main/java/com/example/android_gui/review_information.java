package com.example.android_gui;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
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

        //Which will contain three sub layouts each for sender info, arrows and receiver info.
        LinearLayout oneRecordLinearLayout = new LinearLayout(this);
        oneRecordLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        oneRecordLinearLayout.setOrientation(LinearLayout.VERTICAL);

        //sender layout
        LinearLayout senderLayout = new LinearLayout(this);
        senderLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        senderLayout.setOrientation(LinearLayout.HORIZONTAL);

        //This will be used by each textview in the sender or receiver layout.
        LinearLayout.LayoutParams receiverSenderLayoutParams = new LinearLayout.LayoutParams(
                0, // width set to 0dp to use weight for sizing
                LinearLayout.LayoutParams.WRAP_CONTENT, // height set to wrap content
                1 // weight set to 1 (or any value you want to allocate proportional space)
        );



        //Creating textViews of sender name
        TextView senderNametextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        senderNametextView.setText(intent.getStringExtra("senderName"));
        senderNametextView.setLayoutParams(receiverSenderLayoutParams);
        senderLayout.addView(senderNametextView);

        //Creating textViews of sender Email
        TextView senderEmailtextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        senderEmailtextView.setText(intent.getStringExtra("senderEmail"));
        senderEmailtextView.setLayoutParams(receiverSenderLayoutParams);
        senderLayout.addView(senderEmailtextView);

        //Creating textViews of sender Contact Information.
        TextView senderContacttextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        senderContacttextView.setText(intent.getStringExtra("senderContact"));
        senderContacttextView.setLayoutParams(receiverSenderLayoutParams);
        senderLayout.addView(senderContacttextView);

        //Creating textViews of sender Country Information.
        TextView senderCountrytextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        senderCountrytextView.setText(intent.getStringExtra("senderCountry"));
        senderCountrytextView.setLayoutParams(receiverSenderLayoutParams);
        senderLayout.addView(senderCountrytextView);

        //Creating textViews of sender Country Information.
        TextView senderAddresstextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        senderAddresstextView.setText(intent.getStringExtra("senderAddress"));
        senderAddresstextView.setLayoutParams(receiverSenderLayoutParams);
        senderLayout.addView(senderAddresstextView);

//        parentLayout.setVisibility(View.VISIBLE);
        //Now add the sender layout inside the parent layout

        oneRecordLinearLayout.addView(senderLayout);



        // Create a layout for arrows
        LinearLayout arrowLayout = new LinearLayout(this);

// Set layout parameters for the LinearLayout
        LinearLayout.LayoutParams arrowLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        arrowLayoutParams.setMargins(5, 10,0,10);
        arrowLayout.setLayoutParams(arrowLayoutParams);
        arrowLayout.setOrientation(LinearLayout.HORIZONTAL);

// Create the first ImageView for the down arrow
        ImageView downArrowImageView = new ImageView(this);
        downArrowImageView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        downArrowImageView.setImageResource(R.drawable.down_arrow);
        downArrowImageView.setColorFilter(getResources().getColor(R.color.senderDetailsbgclr), PorterDuff.Mode.SRC_IN); // Apply tint color

// Create the second ImageView for the up arrow
        ImageView upArrowImageView = new ImageView(this);
        upArrowImageView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        upArrowImageView.setImageResource(R.drawable.up_arrow); // Set the image resource
        upArrowImageView.setColorFilter(getResources().getColor(R.color.senderDetailsbgclr), PorterDuff.Mode.SRC_IN); // Apply tint color

// Add the ImageViews to the LinearLayout
        arrowLayout.addView(downArrowImageView);
        arrowLayout.addView(upArrowImageView);

        oneRecordLinearLayout.addView(arrowLayout);




        //Create receiver layout
        LinearLayout receiverLayout = new LinearLayout(this);
        receiverLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        receiverLayout.setOrientation(LinearLayout.HORIZONTAL);



        //Creating textViews of sender name
        TextView receiverNametextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        receiverNametextView.setText(intent.getStringExtra("receiverName"));
        receiverNametextView.setLayoutParams(receiverSenderLayoutParams);
        receiverLayout.addView(receiverNametextView);

        //Creating textViews of sender Email
        TextView receiverEmailtextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        receiverEmailtextView.setText(intent.getStringExtra("receiverEmail"));
        receiverEmailtextView.setLayoutParams(receiverSenderLayoutParams);
        receiverLayout.addView(receiverEmailtextView);

        //Creating textViews of sender Contact Information.
        TextView receiverContacttextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        receiverContacttextView.setText(intent.getStringExtra("receiverContact"));
        receiverContacttextView.setLayoutParams(receiverSenderLayoutParams);
        receiverLayout.addView(receiverContacttextView);

        //Creating textViews of sender Country Information.
        TextView receiverCountrytextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        receiverCountrytextView.setText(intent.getStringExtra("receiverCountry"));
        receiverCountrytextView.setLayoutParams(receiverSenderLayoutParams);
        receiverLayout.addView(receiverCountrytextView);

        //Creating textViews of sender Country Information.
        TextView receiverAddresstextView = new TextView(new ContextThemeWrapper(this, R.style.CustomTextViewStyle), null, 0);
        receiverAddresstextView.setText(intent.getStringExtra("receiverAddress"));
        receiverAddresstextView.setLayoutParams(receiverSenderLayoutParams);
        receiverLayout.addView(receiverAddresstextView);

        //Add receiver layout in linear layout.
        oneRecordLinearLayout.addView(receiverLayout);
        parentLayout.addView(oneRecordLinearLayout);


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
