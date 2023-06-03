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

public class mass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        EditText tb=findViewById(R.id.tb5);
        TextView tv=findViewById(R.id.ans5);
        Button bt=findViewById(R.id.anbt5);
        Spinner sp9=findViewById(R.id.arsp9);
        Spinner sp10=findViewById(R.id.arsp10);

        String[] ls={"mg","g","kg","pound","ton"};
        ArrayAdapter ad1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,ls);
        ad1.setDropDownViewResource(android.R.layout.simple_list_item_1);

        sp9.setAdapter(ad1);
        sp10.setAdapter(ad1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tb.getText().toString().isEmpty())
                {
                    Toast.makeText(mass.this, "Please Enter The Value", Toast.LENGTH_SHORT).show();
                }
                else if (!tb.getText().toString().isEmpty()) {
                    double a = Integer.parseInt(tb.getText().toString());

                    double b;
                    if (sp9.getSelectedItem().toString() == "mg" && sp10.getSelectedItem().toString() == "mg") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "mg" && sp10.getSelectedItem().toString() == "g") {
                        b = a * 0.001;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "mg" && sp10.getSelectedItem().toString() == "kg") {
                        b = a * 0.000001;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "mg" && sp10.getSelectedItem().toString() == "pound") {
                        b = a * 0.0000022046;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "mg" && sp10.getSelectedItem().toString() == "ton") {
                        b = a * (1e-9);
                        tv.setText(String.valueOf(b));
                    }

//                ********************************************************************************************************


                    else if (sp9.getSelectedItem().toString() == "g" && sp10.getSelectedItem().toString() == "mg") {
                        b = a * 1000;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "g" && sp10.getSelectedItem().toString() == "g") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "g" && sp10.getSelectedItem().toString() == "kg") {
                        b = a * 0.001;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "g" && sp10.getSelectedItem().toString() == "pound") {
                        b = a * 0.002204;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "g" && sp10.getSelectedItem().toString() == "ton") {
                        b = a * 0.000001;
                        tv.setText(String.valueOf(b));
                    }

//                ************************************************************


                    if (sp9.getSelectedItem().toString() == "kg" && sp10.getSelectedItem().toString() == "mg") {
                        b = a * 1000000;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "kg" && sp10.getSelectedItem().toString() == "g") {
                        b = a * 1000;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "kg" && sp10.getSelectedItem().toString() == "kg") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "kg" && sp10.getSelectedItem().toString() == "pound") {
                        b = a * 2.2046;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "kg" && sp10.getSelectedItem().toString() == "ton") {
                        b = a * 0.001;
                        tv.setText(String.valueOf(b));
                    }

//                ****************************************************************

                    if (sp9.getSelectedItem().toString() == "pound" && sp10.getSelectedItem().toString() == "mg") {
                        b = a * 453592.37;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "pound" && sp10.getSelectedItem().toString() == "g") {
                        b = a * 453.59;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "pound" && sp10.getSelectedItem().toString() == "kg") {
                        b = a * 0.453;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "pound" && sp10.getSelectedItem().toString() == "pound") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "pound" && sp10.getSelectedItem().toString() == "ton") {
                        b = a * 0.000453;
                        tv.setText(String.valueOf(b));
                    }

//                *****************************************************************

                    if (sp9.getSelectedItem().toString() == "ton" && sp10.getSelectedItem().toString() == "mg") {
                        b = a * 1000000000;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "ton" && sp10.getSelectedItem().toString() == "g") {
                        b = a * 1000000;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "ton" && sp10.getSelectedItem().toString() == "kg") {
                        b = a * 1000;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "ton" && sp10.getSelectedItem().toString() == "pound") {
                        b = a * 2204.622;
                        tv.setText(String.valueOf(b));
                    } else if (sp9.getSelectedItem().toString() == "ton" && sp10.getSelectedItem().toString() == "ton") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    }

                }
            }
        });
    }
}