package com.example.exp10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;

public class MainActivity extends AppCompatActivity {

    EditText data;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = (EditText)findViewById(R.id.tvWrite);
        submit = (Button)findViewById(R.id.btSave);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!data.getText().toString().isEmpty()) {
                    File f = new File(MainActivity.this.getFilesDir(), "Text");
                    if (!f.exists()) {
                        f.mkdir();
                    }
                    try {
                        File gpxfile = new File(f, "sample");
                        FileWriter writer = new FileWriter(gpxfile);
                        writer.append(data.getText().toString());
                        writer.flush();
                        writer.close();
                        Toast.makeText(MainActivity.this, "SAVED", Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                    }
                }
            }
        });
    }
}