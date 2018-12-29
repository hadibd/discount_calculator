package com.example.hadi.discountcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mainPrice, discountPrice, netPrice;
    ImageView Banner;
    Button resultButton, ClearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPrice = findViewById(R.id.priceArea);
        discountPrice = findViewById(R.id.discountArea);

        netPrice = findViewById(R.id.resultArea);

        resultButton = findViewById(R.id.calculateBtn);
        ClearButton = findViewById(R.id.ClearBtn);

        Banner = findViewById(R.id.add);


        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = mainPrice.getText().toString();
                String num2 = discountPrice.getText().toString();
                double n1 = Double.parseDouble(num1);
                double n2 = Double.parseDouble(num2);
                double finalResult = ((100-n2)*n1)/100;
                netPrice.setText(finalResult+"");
            }
        });

        ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPrice.setText(null);
                discountPrice.setText(null);
                netPrice.setText(null);

            }
        });

        Banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,details.class);
                startActivity(i);
            }
        });

    }
}
