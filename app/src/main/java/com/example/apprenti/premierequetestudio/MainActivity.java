package com.example.apprenti.premierequetestudio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkBox =(CheckBox) findViewById(R.id.checkbox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editFirstName = (EditText) findViewById(R.id.first_name);
                EditText editLastName = (EditText) findViewById(R.id.last_name);
                Button button = (Button) findViewById(R.id.button);
                if (checkBox.isChecked()) {
                    editFirstName.setEnabled(true);
                    editLastName.setEnabled(true);
                    button.setEnabled(true);

                }else {
                    editFirstName.setEnabled(false);
                    editLastName.setEnabled(false);
                    button.setEnabled(false);

                }

            }
        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editFirstName = (EditText) findViewById(R.id.first_name);
                EditText editLastName = (EditText) findViewById(R.id.last_name);
                if(editFirstName.getText().toString().isEmpty()
                    ||editLastName.getText().toString().isEmpty()) {
                    Context context = getApplicationContext();
                    CharSequence text = getResources().getString(R.string.error);
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }else{

                    TextView textCongratulation = (TextView) findViewById(R.id.congratulation);
                    textCongratulation.setText(getResources().getString(R.string.congratulation)
                            + " " + editFirstName.getText().toString()
                             + " " + editLastName.getText().toString() +" !"

                    );


                }

            }
        });


    }
}
