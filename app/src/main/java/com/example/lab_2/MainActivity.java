package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner ItemsToCount;
    private EditText TextEditorUI;
    private TextView TVResult;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.TextEditorUI = findViewById(R.id.TextEditorUI);
        this.TVResult = findViewById(R.id.TVResult);

        this.spinner = (Spinner) findViewById(R.id.ItemsToCount);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this,
                R.array.CountOptions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        this.spinner.setAdapter(adapter);
    }

    public void BtnCountClick(View view) {
        String SelectionChars = getResources().getString(R.string.Selection_Chars);
        if(this.spinner.getSelectedItem().toString().equalsIgnoreCase("Words")) {
            String UI = this.TextEditorUI.getText().toString();
            Log.i("UserText", UI);

            int count = TextCounter.getWordCount(UI);
            Log.i("UserTextCount", String.valueOf(count));

            this.TVResult.setText(String.valueOf(count));
        } else if(this.spinner.getSelectedItem().toString().equalsIgnoreCase("Chars")) {
        }
    }
    }


}