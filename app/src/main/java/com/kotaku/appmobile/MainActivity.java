package com.kotaku.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    private Button showButton;
    private TextView showName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showButton=findViewById(R.id.button);
        showName=findViewById(R.id.TextName);
        editText=(EditText)findViewById(R.id.editText);

      showButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              showName.setText(editText.getText().toString());
          }
      });

    }

}
