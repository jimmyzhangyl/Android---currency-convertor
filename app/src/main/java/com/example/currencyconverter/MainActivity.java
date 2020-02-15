package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText inputNumberText = (EditText) findViewById(R.id.inputNumber);
        Double inputNumber = Double.parseDouble(inputNumberText.getText().toString());
        Toast.makeText(MainActivity.this, inputNumber.toString(), Toast.LENGTH_SHORT).show();
        Log.i("Amount",String.valueOf(inputNumber));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
