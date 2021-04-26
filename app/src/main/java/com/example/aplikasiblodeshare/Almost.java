package com.example.aplikasiblodeshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Almost extends AppCompatActivity {
    private Button btnalmost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
        //26-04-2021,10118055,Reza Pratama, IF2

        btnalmost = findViewById(R.id.btnalmost);
        btnalmost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Almost.this,Verify.class));
            }
        });
    }
}