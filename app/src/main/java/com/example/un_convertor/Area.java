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

public class Area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        EditText tb=findViewById(R.id.tb1);
        TextView tv=findViewById(R.id.ans1);
        Button bt=findViewById(R.id.anbt1);
        Spinner sp1=findViewById(R.id.arsp1);
        Spinner sp2=findViewById(R.id.arsp2);

        String[] ls={"cm","mt","km","in","ft","ml"};
        ArrayAdapter ad1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,ls);
        ad1.setDropDownViewResource(android.R.layout.simple_list_item_1);

        sp1.setAdapter(ad1);
        sp2.setAdapter(ad1);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tb.getText().toString().isEmpty())
                {
                    Toast.makeText(Area.this, "Please Enter The Value", Toast.LENGTH_SHORT).show();
                }
                else if (!tb.getText().toString().isEmpty()) {
                    double a = Integer.parseInt(tb.getText().toString());
                    double b;

                    if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "cm") {
                        b = 1 * a;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "mt") {
                        b = a * 0.01;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "km") {
                        b = a * 0.00001;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "in") {
                        b = a * 0.3937;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "ft") {
                        b = a * 0.03280;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "ml") {
                        b = a * 0.00000621;
                        tv.setText(String.valueOf(b));
                    }


//                **************************************************
                    else if (sp1.getSelectedItem().toString() == "mt" && sp2.getSelectedItem().toString() == "cm") {
                        b = a * 100;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "mt" && sp2.getSelectedItem().toString() == "mt") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "mt" && sp2.getSelectedItem().toString() == "km") {
                        b = a * 0.001;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "mt" && sp2.getSelectedItem().toString() == "in") {
                        b = a * 39.37007;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "mt" && sp2.getSelectedItem().toString() == "ft") {
                        b = a * 3.2808;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "mt" && sp2.getSelectedItem().toString() == "ml") {
                        b = a * 0.000621;
                        tv.setText(String.valueOf(b));
                    }

//                ********************************************

                    else if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "cm") {
                        b = a * 100000;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "mt") {
                        b = a * 1000;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "km") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "in") {
                        b = a * 39370.078;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "ft") {
                        b = a * 3280.8398;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "km" && sp2.getSelectedItem().toString() == "ml") {
                        b = a * 0.62137;
                        tv.setText(String.valueOf(b));
                    }


//                ************************************

                    else if (sp1.getSelectedItem().toString() == "in" && sp2.getSelectedItem().toString() == "cm") {
                        b = a * 0.39397;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "in" && sp2.getSelectedItem().toString() == "mt") {
                        b = a * 0.00062137;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "in" && sp2.getSelectedItem().toString() == "km") {
                        b = a * 39370.078;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "in" && sp2.getSelectedItem().toString() == "in") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "in" && sp2.getSelectedItem().toString() == "ft") {
                        b = a * 12;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "in" && sp2.getSelectedItem().toString() == "ml") {
                        b = a * 63360;
                        tv.setText(String.valueOf(b));
                    }

//                ***********************************

                    else if (sp1.getSelectedItem().toString() == "ft" && sp2.getSelectedItem().toString() == "cm") {
                        b = 0.03280 * a;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "ft" && sp2.getSelectedItem().toString() == "mt") {
                        b = a * 3.2808;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "ft" && sp2.getSelectedItem().toString() == "km") {
                        b = a * 3280.8398;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "ft" && sp2.getSelectedItem().toString() == "in") {
                        b = a * 0.08333;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "ft" && sp2.getSelectedItem().toString() == "ft") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "ft" && sp2.getSelectedItem().toString() == "ml") {
                        b = a * 5280;
                        tv.setText(String.valueOf(b));
                    }

//                ***********************************

                    else if (sp1.getSelectedItem().toString() == "ml" && sp2.getSelectedItem().toString() == "cm") {
                        b = 0.0000062137 * a;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "ml" && sp2.getSelectedItem().toString() == "mt") {
                        b = a * 0.00062137;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "ml" && sp2.getSelectedItem().toString() == "km") {
                        b = a * 0.621371;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "ml" && sp2.getSelectedItem().toString() == "in") {
                        b = a * 0.000015782;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "ml" && sp2.getSelectedItem().toString() == "ft") {
                        b = a * 0.00018939;
                        tv.setText(String.valueOf(b));
                    } else if (sp1.getSelectedItem().toString() == "ml" && sp2.getSelectedItem().toString() == "ml") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else {
                        Toast.makeText(Area.this, "select any one", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


    }
}