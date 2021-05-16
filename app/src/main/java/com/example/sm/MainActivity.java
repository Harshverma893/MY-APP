package com.example.sm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    EditText editText;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
    }
    public void calculate(View view){
        String s =editText.getText().toString();
        String q= editText2.getText().toString();
        float a = Float.parseFloat(s);
        float b = Float.parseFloat(q);
        double c = a+b;
        textView.setText("The corresponding Sum is "+c);
        Toast.makeText(this, "Calculated", Toast.LENGTH_SHORT).show();
    }
}