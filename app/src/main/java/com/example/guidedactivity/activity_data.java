package com.example.guidedactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class activity_data extends AppCompatActivity {
    TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        tvData = findViewById(R.id.textView);

        try {
            ContactsDb db = new ContactsDb(this);
            db.open();
            tvData.setText(db.getData());
            db.close();
            Toast.makeText(activity_data.this, "Successfully Added", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(activity_data.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

}
