package edu.cs.sampleappspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spcLanguage);
        populateSpinner();

    }

    private void populateSpinner() {
        ArrayList<String> data = new ArrayList<String>();
        data.add("Java");
        data.add("C#");
        data.add("C++");
        data.add("react native");
        data.add("PHP");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_item, data);
        spinner.setAdapter(adapter);
    }

    public void btn_OnClick(View view) {
        Spinner spnLanguage = findViewById(R.id.spcLanguage);
        String str = spnLanguage.getSelectedItem().toString();
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}