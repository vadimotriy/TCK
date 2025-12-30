package com.example.tck;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private boolean T = false;
    private boolean C = false;
    private boolean K = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T = !T;
                if (T) {
                    button1.setBackgroundTintList(ColorStateList.valueOf(
                            ContextCompat.getColor(MainActivity.this, R.color.button_true)
                    ));
                } else {
                    button1.setBackgroundTintList(ColorStateList.valueOf(
                            ContextCompat.getColor(MainActivity.this, R.color.button_false)
                    ));
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C = !C;
                if (C) {
                    button2.setBackgroundTintList(ColorStateList.valueOf(
                            ContextCompat.getColor(MainActivity.this, R.color.button_true)
                    ));
                } else {
                    button2.setBackgroundTintList(ColorStateList.valueOf(
                            ContextCompat.getColor(MainActivity.this, R.color.button_false)
                    ));
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                K = !K;
                if (K) {
                    button3.setBackgroundTintList(ColorStateList.valueOf(
                            ContextCompat.getColor(MainActivity.this, R.color.button_true)
                    ));
                } else {
                    button3.setBackgroundTintList(ColorStateList.valueOf(
                            ContextCompat.getColor(MainActivity.this, R.color.button_false)
                    ));
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "";

                if (T && C && K) {
                    message = "Потужно-мобиль выехал. Ожидайте!";
                } else {
                    message = "ТЦК еще не активирован!";
                }

                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}