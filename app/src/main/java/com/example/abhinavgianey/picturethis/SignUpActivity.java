package com.example.abhinavgianey.picturethis;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity {

    boolean maleClicked = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setDropDown();
    }
    private void setDropDown() {
        Spinner monthSpinner = (Spinner) findViewById(R.id.month_spinner);
        ArrayAdapter<CharSequence> monthAdapter = ArrayAdapter.createFromResource(this,
                R.array.months_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        monthSpinner.setAdapter(monthAdapter);
        Spinner daySpinner = (Spinner) findViewById(R.id.day_spinner);
        ArrayAdapter<CharSequence> dayAdapter = ArrayAdapter.createFromResource(this,
                R.array.days_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        dayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        daySpinner.setAdapter(dayAdapter);
        Spinner yearSpinner = (Spinner) findViewById(R.id.year_spinner);
        ArrayAdapter<CharSequence> yearAdapter = ArrayAdapter.createFromResource(this,
                R.array.years_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        yearSpinner.setAdapter(yearAdapter);
    }

    public void onMaleClick(View view) {
        if (maleClicked){
            return;
        }
        maleClicked = true;
        Button maleButton = (Button) view;
        maleButton.setBackground(ContextCompat.getDrawable(this, R.drawable.bordered_button));
        maleButton.setTextColor(0xFFFFFFFF);
        Button femaleButton = (Button) findViewById(R.id.femaleButton);
        femaleButton.setBackground(ContextCompat.getDrawable(this, R.drawable.bordered_button2));
        femaleButton.setTextColor(0xFF002C7D);

    }

    public void onFemaleClick(View view) {
        if (!maleClicked){
            return;
        }
        maleClicked = false;
        Button femaleButton = (Button) view;
        femaleButton.setBackground(ContextCompat.getDrawable(this, R.drawable.bordered_button4));
        femaleButton.setTextColor(0xFFFFFFFF);
        Button maleButton = (Button) findViewById(R.id.maleButton);
        maleButton.setBackground(ContextCompat.getDrawable(this, R.drawable.bordered_button3));
        maleButton.setTextColor(0xFF002C7D);
    }
}
