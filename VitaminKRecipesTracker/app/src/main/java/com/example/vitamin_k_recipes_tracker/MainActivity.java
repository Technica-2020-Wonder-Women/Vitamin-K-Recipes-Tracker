package com.example.vitamin_k_recipes_tracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.DatePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

//test
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void avg(View view){
        double sum = 0;
        String prefix = "editTextNumberDecimal";
        for (int i = 1; i <= 7; i++) {
            String idName = prefix.concat(Integer.toString(i));
            int id = getResources().getIdentifier(idName, "id", getPackageName());
            EditText et = (EditText) findViewById(id);
            String strVal = et.getText().toString();
            Double val = Double.parseDouble(strVal);
            sum += val;
        }
        double avg = sum/7.0;
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(Double.toString(avg));
    }


}