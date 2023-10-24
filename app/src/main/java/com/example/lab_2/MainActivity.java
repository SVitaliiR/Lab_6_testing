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

    private Spinner itemsToCount;
    private EditText textEditorUI;
    private TextView tVResult;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textEditorUI = findViewById(R.id.textEditorUI);
        this.tVResult = findViewById(R.id.tVResult);

        this.spinner = (Spinner) findViewById(R.id.itemsToCount);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this,
                R.array.CountOptions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        this.spinner.setAdapter(adapter);
    }

    public void BtnCountClick(View view) {
        String SelectionChars = getResources().getString(R.string.Selection_Chars);
        String UI = this.textEditorUI.getText().toString();

        if(this.spinner.getSelectedItem().toString().equalsIgnoreCase(getResources().getString(R.string.Selection_Words))) {
            int wordCount = TextCounter.getWordCount(UI);
            tVResult.setText(String.valueOf(wordCount));


        } else {
            Log.i("UserText", UI);

            int count = CharsCounter.getChartsCount(UI);
            Log.i("UserTextCount", String.valueOf(count));

            this.tVResult.setText(String.valueOf(count));
        }
    }

}