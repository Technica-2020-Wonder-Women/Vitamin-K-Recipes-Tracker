package com.example.vitamin_k_recipes_tracker;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText m_et;
    private int day,month,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String prefix = "editTextDate";
        for (int i = 1; i <= 7; i++) {
            String idName = prefix.concat(Integer.toString(i));
            int id = getResources().getIdentifier(idName, "id", getPackageName());
            m_et = findViewById(id);
            m_et.setOnClickListener(mClickListener);
        }
        Calendar mcalendar = Calendar.getInstance();
        day= mcalendar.get(Calendar.DAY_OF_MONTH);
        year= mcalendar.get(Calendar.YEAR);
        month= mcalendar.get(Calendar.MONTH);
    }

    public void avg(View view){
        double sum = 0;
        String prefix = "editTextNumberDecimal";
        for (int i = 1; i <= 7; i++) {
            String idName = prefix.concat(Integer.toString(i));
            int id = getResources().getIdentifier(idName, "id", getPackageName());
            EditText et = findViewById(id);
            String strVal = et.getText().toString();
            double val = Double.parseDouble(strVal);
            sum += val;
        }
        double avg = sum/7.0;
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(String.format(Locale.getDefault(), getString(R.string.vitaminK_formatter), avg));
    }

    View.OnClickListener mClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            m_et = (EditText) v;
            DateDialog();
        }
    };
    public void DateDialog(){
        DatePickerDialog.OnDateSetListener listener = (view, year, monthOfYear, dayOfMonth) -> {
            Log.d("Calendar", monthOfYear + " " + dayOfMonth+ " " + year);
            System.out.println(monthOfYear + " " + dayOfMonth+ " " + year);
            String text = getString(R.string.date_format, monthOfYear, dayOfMonth, year);
            m_et.setText(text);
        };
        DatePickerDialog dpDialog=new DatePickerDialog(this, listener, year, month, day);
        dpDialog.show();
    }

}