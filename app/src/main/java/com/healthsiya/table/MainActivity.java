package com.healthsiya.table;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button print;
    TextView textView;
    EditText editText;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        print = findViewById(R.id.print_table);
        textView = findViewById(R.id.table_text);
        editText = findViewById(R.id.edit_text);

        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number = editText.getText().toString();
                int n = Integer.parseInt(number);
                result = "";
                for (int i = 1; i<=10; i++ ){
                    result+=n+""+"*"+i+""+"="+" "+n*i+"\n";
                    textView.setText(result);
                }
            }
        });
    }
}