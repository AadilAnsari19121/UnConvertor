package com.example.un_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class temp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        EditText tb=findViewById(R.id.tb3);
        TextView tv=findViewById(R.id.ans3);
        Button bt=findViewById(R.id.anbt3);
        Spinner sp5=findViewById(R.id.arsp5);
        Spinner sp6=findViewById(R.id.arsp6);

        String[] ls={"celsius","fahrenheit","kelvin"};
        ArrayAdapter ad1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,ls);
        ad1.setDropDownViewResource(android.R.layout.simple_list_item_1);

        sp5.setAdapter(ad1);
        sp6.setAdapter(ad1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tb.getText().toString().isEmpty())
                {
                    Toast.makeText(temp.this, "Please Enter The Value", Toast.LENGTH_SHORT).show();
                }
                else if (!tb.getText().toString().isEmpty()) {
                    double a = Integer.parseInt(tb.getText().toString());
                    double b;
                    if (sp5.getSelectedItem().toString() == "celsius" && sp6.getSelectedItem().toString() == "celsius") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp5.getSelectedItem().toString() == "celsius" && sp6.getSelectedItem().toString() == "fahrenheit") {
                        b = a * 33.8;
                        tv.setText(String.valueOf(b));
                    } else if (sp5.getSelectedItem().toString() == "celsius" && sp6.getSelectedItem().toString() == "kelvin") {
                        b = a * 274.15;
                        tv.setText(String.valueOf(b));
                    }

//                ********************************************************************************************************


                    else if (sp5.getSelectedItem().toString() == "fahrenheit" && sp6.getSelectedItem().toString() == "celsius") {
                        b = a * (-17.222222222);
                        tv.setText(String.valueOf(b));
                    } else if (sp5.getSelectedItem().toString() == "fahrenheit" && sp6.getSelectedItem().toString() == "fahrenheit") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp5.getSelectedItem().toString() == "fahrenheit" && sp6.getSelectedItem().toString() == "kelvin") {
                        b = a * 255.928;
                        tv.setText(String.valueOf(b));
                    }

//                ******************************************************************************************************


                    else if (sp5.getSelectedItem().toString() == "kelvin" && sp6.getSelectedItem().toString() == "celsius") {
                        b = a * (-272.15);
                        tv.setText(String.valueOf(b));
                    } else if (sp5.getSelectedItem().toString() == "kelvin" && sp6.getSelectedItem().toString() == "fahrenheit") {
                        b = a * (-457.87);
                        tv.setText(String.valueOf(b));
                    } else if (sp5.getSelectedItem().toString() == "kelvin" && sp6.getSelectedItem().toString() == "kelvin") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else {
                        Toast.makeText(temp.this, "Something Was Wrong", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}