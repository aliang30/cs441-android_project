package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.EditText;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    EditText temp;
    RadioButton inches2Meters;
    RadioButton meters2Inches;
    RadioButton liters2Gallons;
    RadioButton gallons2Liters;
    RadioButton inches2Feet;
    RadioButton feet2Inches;
    RadioButton pounds2Kilos;
    RadioButton kilos2Pounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        temp = (EditText)findViewById(R.id.convert);
        inches2Meters = (RadioButton)findViewById(R.id.fromInchestoMeters);
        meters2Inches = (RadioButton)findViewById(R.id.fromMeterstoInches);
        liters2Gallons = (RadioButton)findViewById(R.id.fromLiterstoGallons);
        gallons2Liters = (RadioButton)findViewById(R.id.fromGallonstoLiters);
        inches2Feet = (RadioButton)findViewById(R.id.fromInchestoFeet);
        feet2Inches = (RadioButton)findViewById(R.id.fromFeettoInches);
        pounds2Kilos = (RadioButton)findViewById(R.id.fromPoundstoKilos);
        kilos2Pounds = (RadioButton)findViewById(R.id.fromKilostoPounds);


    }

    //Do something when button is clicked
    public void buttonOnClick(View v) {
        double value = new Double(temp.getText().toString());

        if(inches2Meters.isChecked()) {
            value = UnitConverter.inches2Meters(value);
        }
        else if (meters2Inches.isChecked()) {
            value = UnitConverter.meters2Inches(value);
        }
        else if (liters2Gallons.isChecked()) {
            value = UnitConverter.liters2Gallons(value);
        }
        else if (gallons2Liters.isChecked()) {
            value = UnitConverter.gallons2Liters(value);
        }
        else if (inches2Feet.isChecked()) {
            value = UnitConverter.inches2feet(value);
        }
        else if (feet2Inches.isChecked()) {
            value = UnitConverter.feet2inches(value);
        }
        else if (pounds2Kilos.isChecked()) {
            value = UnitConverter.pounds2kilograms(value);
        }
        else if (kilos2Pounds.isChecked()) {
            value = UnitConverter.kilograms2pounds(value);
        }

        temp.setText(new Double(value).toString());

        Button button = (Button) v;
        ((Button) v).setText("Convert");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
