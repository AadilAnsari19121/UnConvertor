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

public class volume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        EditText tb=findViewById(R.id.tb4);
        TextView tv=findViewById(R.id.ans4);
        Button bt=findViewById(R.id.anbt4);
        Spinner sp7=findViewById(R.id.arsp7);
        Spinner sp8=findViewById(R.id.arsp8);

        String[] ls={"gallon","liter","milliliter","cc","cm","cin","cft"};
        ArrayAdapter ad1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,ls);

        ad1.setDropDownViewResource(android.R.layout.simple_list_item_1);

        sp7.setAdapter(ad1);
        sp8.setAdapter(ad1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tb.getText().toString().isEmpty())
                {
                    Toast.makeText(volume.this, "Please Enter The Value", Toast.LENGTH_SHORT).show();
                }
                else if (!tb.getText().toString().isEmpty()) {
                    double a = Integer.parseInt(tb.getText().toString());
                    double b;

                    if (sp7.getSelectedItem().toString() == "gallon" && sp8.getSelectedItem().toString() == "gallon") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "gallon" && sp8.getSelectedItem().toString() == "liter") {
                        b = a * 3.7854;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "gallon" && sp8.getSelectedItem().toString() == "milliliter") {
                        b = a * 3785.411;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "gallon" && sp8.getSelectedItem().toString() == "cc") {
                        b = a * 3785.411;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "gallon" && sp8.getSelectedItem().toString() == "cm") {
                        b = a * 0.003785;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "gallon" && sp8.getSelectedItem().toString() == "cin") {
                        b = a * 231;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "gallon" && sp8.getSelectedItem().toString() == "cft") {
                        b = a * 0.13368;
                        tv.setText(String.valueOf(b));
                    }

//                ***********************************************************************************


                    else if (sp7.getSelectedItem().toString() == "liter" && sp8.getSelectedItem().toString() == "gallon") {
                        b = a * 0.264;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "liter" && sp8.getSelectedItem().toString() == "liter") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "liter" && sp8.getSelectedItem().toString() == "milliliter") {
                        b = a * 1000;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "liter" && sp8.getSelectedItem().toString() == "cc") {
                        b = a * 1000;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "liter" && sp8.getSelectedItem().toString() == "cm") {
                        b = a * 0.001;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "liter" && sp8.getSelectedItem().toString() == "cin") {
                        b = a * 61.0237;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "liter" && sp8.getSelectedItem().toString() == "cft") {
                        b = a * 0.03531;
                        tv.setText(String.valueOf(b));
                    }

//                ***********************************************************************************


                    else if (sp7.getSelectedItem().toString() == "milliliter" && sp8.getSelectedItem().toString() == "gallon") {
                        b = a * 0.0002641;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "milliliter" && sp8.getSelectedItem().toString() == "liter") {
                        b = a * 0.001;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "milliliter" && sp8.getSelectedItem().toString() == "milliliter") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "milliliter" && sp8.getSelectedItem().toString() == "cc") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "milliliter" && sp8.getSelectedItem().toString() == "cm") {
                        b = a * 0.000001;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "milliliter" && sp8.getSelectedItem().toString() == "cin") {
                        b = a * 0.61023;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "milliliter" && sp8.getSelectedItem().toString() == "cft") {
                        b = a * 0.00003531;
                        tv.setText(String.valueOf(b));
                    }

                    //                ***********************************************************************************


                    else if (sp7.getSelectedItem().toString() == "cc" && sp8.getSelectedItem().toString() == "gallon") {
                        b = a * 0.0002641;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cc" && sp8.getSelectedItem().toString() == "liter") {
                        b = a * 0.001;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cc" && sp8.getSelectedItem().toString() == "milliliter") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cc" && sp8.getSelectedItem().toString() == "cc") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cc" && sp8.getSelectedItem().toString() == "cm") {
                        b = a * 0.000001;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cc" && sp8.getSelectedItem().toString() == "cin") {
                        b = a * 0.061023;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cc" && sp8.getSelectedItem().toString() == "cft") {
                        b = a * 0.00003531;
                        tv.setText(String.valueOf(b));
                    }


//                ***********************************************************************************


                    else if (sp7.getSelectedItem().toString() == "cm" && sp8.getSelectedItem().toString() == "gallon") {
                        b = a * 264.1720;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cm" && sp8.getSelectedItem().toString() == "liter") {
                        b = a * 1000;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cm" && sp8.getSelectedItem().toString() == "milliliter") {
                        b = a * 1000000;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cm" && sp8.getSelectedItem().toString() == "cc") {
                        b = a * 1000000;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cm" && sp8.getSelectedItem().toString() == "cm") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cm" && sp8.getSelectedItem().toString() == "cin") {
                        b = a * 61023.744;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cm" && sp8.getSelectedItem().toString() == "cft") {
                        b = a * 35.314;
                        tv.setText(String.valueOf(b));
                    }


                    //                ***********************************************************************************


                    else if (sp7.getSelectedItem().toString() == "cin" && sp8.getSelectedItem().toString() == "gallon") {
                        b = a * 0.004329;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cin" && sp8.getSelectedItem().toString() == "liter") {
                        b = a * 0.01638;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cin" && sp8.getSelectedItem().toString() == "milliliter") {
                        b = a * 16.38;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cin" && sp8.getSelectedItem().toString() == "cc") {
                        b = a * 16.38;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cin" && sp8.getSelectedItem().toString() == "cm") {
                        b = a * 0.00001638;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cin" && sp8.getSelectedItem().toString() == "cin") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cin" && sp8.getSelectedItem().toString() == "cft") {
                        b = a * 0.0005787;
                        tv.setText(String.valueOf(b));
                    }


//                ***********************************************************************************


                    else if (sp7.getSelectedItem().toString() == "cft" && sp8.getSelectedItem().toString() == "gallon") {
                        b = a * 7.4805;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cft" && sp8.getSelectedItem().toString() == "liter") {
                        b = a * 28.31;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cft" && sp8.getSelectedItem().toString() == "milliliter") {
                        b = a * 28316.84;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cft" && sp8.getSelectedItem().toString() == "cc") {
                        b = a * 28316.84;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cft" && sp8.getSelectedItem().toString() == "cm") {
                        b = a * 0.02831;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cft" && sp8.getSelectedItem().toString() == "cin") {
                        b = a * 1728;
                        tv.setText(String.valueOf(b));
                    } else if (sp7.getSelectedItem().toString() == "cft" && sp8.getSelectedItem().toString() == "cft") {
                        b = a * 1;
                        tv.setText(String.valueOf(b));
                    } else {
                        Toast.makeText(volume.this, "Something Was Wrong", Toast.LENGTH_SHORT).show();
                    }

                }
                
            }
        });

    }
}